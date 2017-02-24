package com.mxchip.storytoys.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.alibaba.weex.IndexActivity;
import com.mxchip.storytoys.R;

/**
 * Created by SIN on 2017/2/16.
 */

public class ChooseBindTypeActivity extends AppCompatActivity {
    private Context context;

    private ImageView addbyeasylink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_bind_type);

        context = ChooseBindTypeActivity.this;

        initView();
        initClick();
    }

    private void initView(){
        addbyeasylink = (ImageView)findViewById(R.id.addbyeasylink);
    }

    private void initClick(){
        addbyeasylink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, IndexActivity.class);
//                intent.putExtra("weexurl", "http://192.168.3.199:8088/weex/index.js");
                intent.putExtra("weexurl", "http://192.168.3.199:12580/dist/main.js");
                startActivity(intent);
            }
        });
    }
}
