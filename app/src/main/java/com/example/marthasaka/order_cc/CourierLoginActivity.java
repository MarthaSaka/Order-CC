package com.example.marthasaka.order_cc;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CourierLoginActivity extends AppCompatActivity {

    private Button btn_signin;
    private EditText et_phonenumber, et_password;
    private TextView tv_register;

    private ProgressDialog progressDialog;
    private Session session;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courier_login);
        Toolbar toolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);
        session = new Session(CourierLoginActivity.this);
        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
        tv_register = (TextView) findViewById(R.id.tv_register);
        btn_signin = (Button) findViewById(R.id.btn_signin);
        et_phonenumber = (EditText) findViewById(R.id.et_phonenumber);
        et_password = (EditText) findViewById(R.id.et_password);
    }
}
