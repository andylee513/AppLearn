package com.example.lesson03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lesson03.util.DateUtil;

public class ButtonStyleActivity extends AppCompatActivity {

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_style);
        tv = findViewById(R.id.tv_result); // 获取名叫tv_result的文本视图
    }

    // activity_button_style.xml中给btn_click_xml指定了点击方法doClick
    public void doClick(View view) {
        String desc = String.format("%s 您点击了按钮：%s",
                DateUtil.getNowTime(), ((Button) view).getText());
        tv.setText(desc); // 设置文本视图的文本内容
    }
}