package com.bwie.shaoxinxuan1105;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Toolbar tool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件
        tool = findViewById(R.id.tool);

        //设置标题和子标题
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        tool.setTitle("周考");
        tool.setSubtitle("邵新轩");

    }
}
