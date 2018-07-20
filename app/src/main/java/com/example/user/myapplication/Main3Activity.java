package com.example.user.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.user.myapplication.R.id.buttonPhone;

public class Main3Activity extends AppCompatActivity
    implements DialogInterface.OnClickListener{

    Button gialog ;

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
        gialog= (Button) findViewById(R.id.buttonAlert);
        gialog.setOnClickListener((View.OnClickListener) this);//監聽按一下事件

        AlertDialog.Builder bdr=new AlertDialog.Builder(this);
        bdr.setMessage("此功能需要登入會員後才可使用，請點選「登入」後繼續");
        bdr.setTitle("登入會員");//加入標題
        bdr.setIcon(android.R.drawable.presence_audio_away);//加入圖示
        bdr.setCancelable(false);//可按任意處返回

        bdr.setPositiveButton("登入", (DialogInterface.OnClickListener) this);//加入肯定按鈕並監聽事件
        bdr.setNegativeButton("取消", (DialogInterface.OnClickListener) this);//加入否定按鈕並監聽事件
        bdr.show();

    }

    public void buttonAlert(View view)
    {

    }
    public void goBack(View v){
        finish();
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        if(which==DialogInterface.BUTTON_POSITIVE){//如果按下登入
            Intent it=new Intent(this,MainActivity.class);
            startActivity(it);
        }
        else//如果按下取消
        {
            Intent it=new Intent(this,Main2Activity.class);
            startActivity(it);
        }
    }


}
