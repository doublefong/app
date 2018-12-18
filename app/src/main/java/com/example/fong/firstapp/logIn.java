package com.example.fong.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
public class logIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        Button button=(Button)findViewById(R.id.btn_register);//点击注册按钮,跳转注册界面
        button.setOnClickListener(new View.OnClickListener()
        {
          @Override
            public void onClick(View v)
          {
              Intent intent=new Intent(logIn.this,SignIn.class);
              startActivity(intent);
          }
        });
    }

}
