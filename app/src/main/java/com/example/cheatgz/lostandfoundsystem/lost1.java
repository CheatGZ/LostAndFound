package com.example.cheatgz.lostandfoundsystem;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CheatGZ on 2018/3/26.
 */

public class lost1 extends AppCompatActivity {
    private Button btn1;
    private ImageView imageView1;
    private EditText editText1;//备注名
    private EditText editText2;//物品详细描述
    private String string1;//备注名
    private String string2;//物品详细描述
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lost1);

        buttonEvent();//点击按钮事件
        setImageView();
    }
    protected void buttonEvent(){
        btn1=(Button)findViewById(R.id.refer);

        //下一页按钮
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(lost1.this,main.class);
                startActivity(intent1);
            }
        });
    }
    protected void spinnerEvent(){
        List<String> propertykind = new ArrayList<String>();
        propertykind.add("证件");
        propertykind.add("钱包");
        propertykind.add("书籍");
        propertykind.add("电子设备");
        propertykind.add("其他");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, propertykind);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
    }
    protected void EditTextEvent(){
        editText1=(EditText)findViewById(R.id.nickname);
        editText2=(EditText)findViewById(R.id.describe);
        string1=editText1.getText().toString();
        string2=editText2.getText().toString();
    }
    protected void setImageView(){
        imageView1=(ImageView)findViewById(R.id.image);
        imageView1.setImageResource(R.mipmap.wallet);
    }
}