package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        /*Button Home = (Button) findViewById(R.id.button);
        Home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(Main2Activity.this ,MainActivity.class);
                startActivity(intent);

            }
        });
        */
    }

    public void gotopage3(View v){
        Intent it=new Intent(this,Main3Activity.class);
        startActivity(it);
    }

    public void goBack(View v){
        finish();
    }

}
