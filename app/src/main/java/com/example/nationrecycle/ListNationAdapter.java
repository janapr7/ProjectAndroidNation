package com.example.nationrecycle;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListNationAdapter extends RecyclerView.Adapter<ListNationAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<Nation> listNation;

    public ArrayList<Nation> getListNation() {
        return listNation;
    }

    public void setListNation(ArrayList<Nation> listNation) {
        this.listNation = listNation;
    }

    public ListNationAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_nation, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, final int position) {
        categoryViewHolder.tvName.setText(getListNation().get(position).getName());
        categoryViewHolder.tvRemarks.setText(getListNation().get(position).getRemarks());
        Glide.with(context)
                .load(getListNation().get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(categoryViewHolder.imgPhoto);

        categoryViewHolder.imgPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context.getApplicationContext(), DetailActivity.class);
                i.putExtra("name",getListNation().get(position).getName());
                i.putExtra("desc",getListNation().get(position).getDesc());
                i.putExtra("photo",getListNation().get(position).getPhoto());
                context.startActivity(i);

            }
        });

        categoryViewHolder.detail_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context.getApplicationContext(), DetailActivity.class);
                i.putExtra("name",getListNation().get(position).getName());
                i.putExtra("desc",getListNation().get(position).getDesc());
                i.putExtra("photo",getListNation().get(position).getPhoto());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListNation().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;
        LinearLayout detail_list;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            detail_list = itemView.findViewById(R.id.list_linier);
        }
    }
}
