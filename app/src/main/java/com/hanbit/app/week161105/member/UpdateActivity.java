package com.hanbit.app.week161105.member;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hanbit.app.week161105.R;

public class UpdateActivity extends AppCompatActivity {
    MemberService service;
    TextView tv_name,tv_id;
    EditText et_pw,et_email,et_phone,et_address;
    Button bt_confirm,bt_cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        service = new MemberServiceImpl(this.getApplicationContext());
    }
}
