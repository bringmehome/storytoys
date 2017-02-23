package com.mxchip.storytoys.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

import com.mxchip.storytoys.R;
import com.mxchip.storytoys.helper.CheckTool;
import com.mxchip.storytoys.helper.RenderPage;
import com.taobao.weex.IWXRenderListener;
import com.taobao.weex.WXSDKInstance;

public class IndexWeexActivity extends AppCompatActivity implements IWXRenderListener {
    public static final String TAG = "---Main---";

    private String weexurl = "http://192.168.3.199:8081/weex_tmp/h5_render/index.js";

    WXSDKInstance mInstance;
    ViewGroup mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);

        if(CheckTool.checkPara(getIntent().getStringExtra("weexurl"))){
            weexurl =getIntent().getStringExtra("weexurl");
        }

        mContainer = (ViewGroup) findViewById(R.id.logincontainer);
        mInstance = new WXSDKInstance(this); //create weex instance
        mInstance.registerRenderListener(this); //SimpleRenderListener需要开发者来实现

        RenderPage renderPage = new RenderPage(this, mInstance, TAG);

        renderPage.openWXUrl(weexurl);
//        downLoadLocalFile();
    }

    @Override
    public void onStart() {
        super.onStart();
        if (mInstance != null) {
            mInstance.onActivityStart();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mInstance != null) {
            mInstance.onActivityResume();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (mInstance != null) {
            mInstance.onActivityPause();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mInstance != null) {
            mInstance.onActivityStop();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mInstance != null) {
            mInstance.onActivityDestroy();
        }
    }

    @Override
    public void onViewCreated(WXSDKInstance instance, View view) {
        if (mContainer != null) {
            mContainer.addView(view);
        }
    }

    @Override
    public void onRenderSuccess(WXSDKInstance instance, int width, int height) {

    }

    @Override
    public void onRefreshSuccess(WXSDKInstance instance, int width, int height) {

    }

    @Override
    public void onException(WXSDKInstance instance, String errCode, String msg) {

    }
}