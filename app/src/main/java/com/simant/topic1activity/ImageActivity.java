package com.simant.topic1activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class ImageActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton rdoOne, rdoTwo, rdoThree;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        rdoOne = findViewById(R.id.rdo1);
        rdoTwo = findViewById(R.id.rdo2);
        rdoThree = findViewById(R.id.rdo3);

        imageView = findViewById(R.id.herrey);

        rdoOne.setOnClickListener(this);
        rdoTwo.setOnClickListener(this);
        rdoThree.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.rdo1):
                imageView.setBackgroundResource(R.drawable.logo1);
            case (R.id.rdo2):
                imageView.setBackgroundResource(R.drawable.logo2);
            case (R.id.rdo3):
                imageView.setBackgroundResource(R.drawable.logo3);
        }
    }
}
