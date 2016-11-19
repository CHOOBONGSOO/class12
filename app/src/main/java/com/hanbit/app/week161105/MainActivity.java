package com.hanbit.app.week161105;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hanbit.app.week161105.calc.CalcActivity;
import com.hanbit.app.week161105.member.JoinActivity;
import com.hanbit.app.week161105.member.LoginActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button bt_calc,bt_join,bt_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_calc = (Button) findViewById(R.id.bt_calc);
        bt_join = (Button) findViewById(R.id.bt_join);
        bt_login = (Button) findViewById(R.id.bt_login);

        bt_calc.setOnClickListener(this);
        bt_join.setOnClickListener(this);
        bt_login.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.bt_calc:
                Intent intent = new Intent(this.getApplicationContext(), CalcActivity.class);
                this.startActivity(intent);
                break;
            case R.id.bt_join:
                Intent intent2 = new Intent(this.getApplicationContext(), JoinActivity.class);
                this.startActivity(intent2);
                break;
            case R.id.bt_login:
                Intent intent3 = new Intent(this.getApplicationContext(), LoginActivity.class);
                this.startActivity(intent3);
                break;

        }

    }
}
