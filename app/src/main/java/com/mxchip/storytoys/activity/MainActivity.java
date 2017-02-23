package com.mxchip.storytoys.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.mxchip.storytoys.R;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "---Main---";

    private TextView toindex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        toindex = (TextView)findViewById(R.id.toindex);
        toindex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, IndexWeexActivity.class);
                startActivity(intent);
            }
        });
    }

}
