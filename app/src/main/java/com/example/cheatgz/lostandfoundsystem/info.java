package com.example.cheatgz.lostandfoundsystem;

import android.accounts.AbstractAccountAuthenticator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by CheatGZ on 2018/3/26.
 */

public class info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        Button btn1=(Button)findViewById(R.id.refer);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(info.this,main.class);
                startActivity(intent1);
            }
        });
    }
}
