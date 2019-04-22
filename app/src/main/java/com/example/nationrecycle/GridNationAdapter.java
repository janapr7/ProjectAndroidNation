package com.example.nationrecycle;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridNationAdapter extends RecyclerView.Adapter<GridNationAdapter.GridViewHolder> {
    private Context context;
    private ArrayList<Nation> listNation;

    public GridNationAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Nation> getListNation() {
        return listNation;
    }

    public void setListNation(ArrayList<Nation> listNation) {
        this.listNation = listNation;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_nation, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
        Glide.with(context)
                .load(getListNation().get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListNation().size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
