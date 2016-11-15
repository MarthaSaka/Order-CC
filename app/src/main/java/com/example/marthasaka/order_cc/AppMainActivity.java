package com.example.marthasaka.order_cc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class AppMainActivity extends AppCompatActivity {

    private Button button2;
    private Button button;
    private Button btn_gac;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_main);
        btn_gac = (Button) findViewById(R.id.btn_gac);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button1 = (Button) findViewById(R.id.button1);








        Intent i = new Intent(getApplicationContext(),WholesalerLoginActivity .class);
        startActivity(i);
        finish();

    }
}
