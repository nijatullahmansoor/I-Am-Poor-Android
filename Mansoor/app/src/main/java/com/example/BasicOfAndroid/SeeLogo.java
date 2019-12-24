package com.example.BasicOfAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SeeLogo extends AppCompatActivity {

    ImageView myNextImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_logo);

    }
    //here we will define a function which will change the image and return back to the main page or mainActivity
    public void nextImage(View view){
        myNextImage=findViewById(R.id.firstCar);
        myNextImage.setImageResource(R.drawable.f);
        Intent intent=new Intent(this,MainActivity.class);
        finish();
        startActivity(intent);

    }
}
