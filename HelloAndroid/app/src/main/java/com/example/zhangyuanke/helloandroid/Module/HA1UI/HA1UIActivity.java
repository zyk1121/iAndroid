package com.example.zhangyuanke.helloandroid.Module.HA1UI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.zhangyuanke.helloandroid.R;
import com.example.zhangyuanke.helloandroid.Tools.BaseActivity;

public class HA1UIActivity extends BaseActivity {


    private String[] data = {
            "1.Android布局",
            "2.简单控件",
            "3.代码布局",
            "4.自定义控件"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ha1_ui);
        setupDataAndView();
    }

    // 设置数据和view
    private void setupDataAndView()
    {
        // 适配器
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(HA1UIActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView)findViewById(R.id.ha1_list_view);
        listView.setAdapter(adapter);
        // 事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                executeItemForRow(i);
            }
        });
    }

    private void executeItemForRow(int row)
    {
        Intent intent = null;
        switch (row)
        {
            case 0:
                // Layout
                intent = new Intent(HA1UIActivity.this, HA1Layout.class);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
        if (intent != null) {
            startActivity(intent);
        }
    }

}
