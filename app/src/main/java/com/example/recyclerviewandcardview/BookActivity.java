package com.example.recyclerviewandcardview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BookActivity extends AppCompatActivity {

    private TextView tvtitle,tvdescription,tvcategory;
    private ImageView Img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        tvtitle = (TextView) findViewById(R.id.txttitle);
        tvdescription = (TextView) findViewById(R.id.txtDesc);
        tvcategory = (TextView) findViewById(R.id.txtCat);
        Img = (ImageView) findViewById(R.id.bookthumbnail);

        Intent intent = getIntent();
        String title= intent.getExtras().getString("title");
        String Description = intent.getExtras().getString("description");
        String category = intent.getExtras().getString("category");
        int img = intent.getExtras().getInt("img");

        tvtitle.setText(title);
        tvcategory.setText(category);
        Img.setImageResource(img);
        tvdescription.setText(Description);
    }
}
