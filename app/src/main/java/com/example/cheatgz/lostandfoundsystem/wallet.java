package com.example.cheatgz.lostandfoundsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by CheatGZ on 2018/3/26.
 */

public class wallet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wallet);

        Button btn1=(Button)findViewById(R.id.charge);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(wallet.this,main.class);
                startActivity(intent1);
            }
        });
    }
}
