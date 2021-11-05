package com.example.utsmobprog_2012510158;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity<new_View> extends AppCompatActivity {
    Button btCam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); btCam=(Button)findViewById(R.id.buttonTakePicture);}


        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M && void checkSelfPermission (Manifest.permission.WRITE_EXTERNAL_STORAGE)
        != PackageManager.PERMISSION_GRANTED) {
        requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE});
        }

        btCam.setOnClickListener{new_View.onClickListener(){
        @Override
                public void onClick(View v) {
            Intent intent=new Intent(createPackageContext(MainActivity,this,CaptureActivity.class);
            startActivity(intent);
        }
    };