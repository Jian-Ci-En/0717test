package com.example.user.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity
    implements View.OnClickListener {
    //TextView txv;
    Button clickTimes;
    int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //txv=(TextView)findViewById(R.id.textView3);
        clickTimes = (Button) findViewById(R.id.buttonOnclick);
        clickTimes.setOnClickListener(this);//監聽按一下事件



    }


    public void gotopage3(View v) {
        Intent it = new Intent(this, Main3Activity.class);
        startActivity(it);
    }

    public void goBack(View v) {
        finish();
    }



    @Override
    public void onClick(View v) {           //我的最愛按鈕
        // txv.setText(String.valueOf(++counter));
        ++counter;
        if (counter % 2 == 0)
            Snackbar.make(findViewById(R.id.buttonOnclick), "已移除我的最愛", Snackbar.LENGTH_LONG).show();
        else
            Snackbar.make(findViewById(R.id.buttonOnclick), "已加到我的最愛", Snackbar.LENGTH_LONG).show();


        //Toast favorite=Toast.makeText(this,"已加到我的最愛",Toast.LENGTH_LONG);
        //favorite.show();

    }

}


