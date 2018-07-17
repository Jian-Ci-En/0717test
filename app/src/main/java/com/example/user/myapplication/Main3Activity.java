package com.example.user.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.user.myapplication.R.id.buttonPhone;

public class Main3Activity extends AppCompatActivity {



    public void onClick(View v){
        Intent it=new Intent(Intent.ACTION_VIEW);

        switch(v.getId()){
            case R.id.buttonPhone:
                it.setData(Uri.parse("tel:0224582689"));
                break;


            case R.id.buttonGps:
                it.setData(Uri.parse(("geo:24.984872, 121.342347")));
                break;

            case R.id.buttonSearch:
                it.setData(Uri.parse(("geo:0,0?q=桃園市龜山區德明路5號")));
                break;
        }

        startActivity(it);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void goBack(View v){
        finish();
    }
}
