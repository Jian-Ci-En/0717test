package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText name,password,phone;
    TextView txv;
    private Button button;
String test="test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        name=(EditText)findViewById(R.id.name);
        password=(EditText)findViewById(R.id.password);
        phone=(EditText)findViewById(R.id.phone);
        txv=(TextView)findViewById(R.id.txv);

       button = (Button) findViewById(R.id.button3);
       /* Button nextpagebtn=(Button)findViewById(R.id.button);

       nextpagebtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
               Intent intent=new Intent();
               intent.setClass(MainActivity.this ,Main2Activity.class);
               startActivity(intent);

           }
       });*/


    }

    public void gotopage2(View v){
        Intent it=new Intent(this,Main2Activity.class);
        startActivity(it);
    }


   public void onclick(View v)
    {
        Intent it=new Intent(this,Main3Activity.class);
        startActivity(it);
        txv.setText(name.getText().toString()+"的電話是"+phone.getText());
    }
}
