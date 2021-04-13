package com.example.imagerestapiexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button getImageButton;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.image_view);

        getImageButton = findViewById(R.id.get_image_button);
        getImageButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.get_image_button:
                getImageButtonOnClick();
                break;
        }
    }

    private void getImageButtonOnClick() {
        Picasso.get()
                .load("https://robohash.org/sophia?set=set4")
                .resize(1000, 1000)
                .centerCrop()
                .into(imageView);
    }
}