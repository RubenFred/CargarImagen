package com.info.fred.pc3.appcargaimagen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.File;

import static java.lang.System.load;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView)findViewById(R.id.miImagen);

        //File imgFile = new File("/storage/emulated/0/Pictures/IMG-20161029-WA0025.jpg");

        //Glide.with(this).load(imgFile).into(imageView);

        //Glide.with(this).load('http://goo.gl/gEgYUd').into(imageView);
        Glide.with(this)
                .load("http://endimages.s3.amazonaws.com/cache/58/f3/58f36672c4e6b1f97b2da261fe2177af.jpg")
                .into(imageView);
    }
}
