package com.example.zhangyuanke.helloandroid.Module.HA1UI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.zhangyuanke.helloandroid.R;
import com.example.zhangyuanke.helloandroid.Tools.BaseActivity;
import com.example.zhangyuanke.helloandroid.Tools.HelloAndroidUtil;
import com.example.zhangyuanke.helloandroid.Tools.LogUtil;

public class HA1UIActivity extends BaseActivity {


    private String[] data = {
            "1.Android布局",
            "2.简单控件",
            "3.代码布局",
            "4.自定义控件",
            "5.控件布局项目"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ha1_ui);
//        testUI();
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
                intent = new Intent(HA1UIActivity.this, HA1SimpleUI.class);
                break;
            case 2:
                intent = new Intent(HA1UIActivity.this, HA1Layout.class);
                break;
            case 3:
                intent = new Intent(HA1UIActivity.this, HA1CustomUI.class);
                break;
            case 4:
                intent = new Intent(HA1UIActivity.this, HA1ProjectUITest.class);
                break;
            default:
                break;
        }
        if (intent != null) {
            startActivity(intent);
        }
    }



















// 测试代码

    private void testUI()
    {
        // 不同的布局中id可以相同，同一个setContentView布局中的ic不能一样，会被覆盖

        LinearLayout linearLayout = (LinearLayout) getLayoutInflater().inflate(R.layout.activity_ha1_ui,null);

        Button btn3 = new Button(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        btn3.setLayoutParams(layoutParams);
        int btn3_id = HelloAndroidUtil.generateViewId();// 返回1
        LogUtil.d("tag","2222 " + btn3_id);
        btn3.setId(btn3_id);
        btn3.setText("btn3");
        linearLayout.addView(btn3);

        setContentView(linearLayout);
    }

}
