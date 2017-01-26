package com.example.alexandru.iasitour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class ImageFullScrenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo_view);

        ImageView imageView = (ImageView) findViewById(R.id.photo_big);

        Intent i = getIntent();
        int id = i.getIntExtra("idimg", 0);
        imageView.setImageResource(id);


    }
}
