package com.example.nationrecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {
    TextView tvName, tvDesc;
    ImageView ivPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvName= findViewById(R.id.tv_name);
        tvDesc=findViewById(R.id.tv_desc);
        ivPhoto=findViewById(R.id.iv_photo);

        Intent i = getIntent();

        String name= i.getStringExtra("name");
        String desc= i.getStringExtra("desc");
        String photo = i.getStringExtra("photo");

        tvName.setText(name);
        tvDesc.setText(desc);
        Glide.with(this)
                .load(photo)
                .apply(new RequestOptions())
                .into(ivPhoto);
        setActionBarTitle("Nation Detail");
    }

    private void setActionBarTitle(String title){
        getSupportActionBar().setTitle(title);
    }
}
