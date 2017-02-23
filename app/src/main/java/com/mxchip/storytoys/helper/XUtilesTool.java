package com.mxchip.storytoys.helper;

import android.util.Log;
import android.widget.Toast;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

/**
 * Created by SIN on 2016/12/16.
 */

public class XUtilesTool {

    private String TAG = "---xut---";

    public void getHttp(){

        Log.d(TAG, "gethttp");

        RequestParams params = new RequestParams("https://www.baidu.com/s");
//        params.setSslSocketFactory(...); // 设置ssl
//        params.addQueryStringParameter("wd", "xUtils");
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Toast.makeText(x.app(), result, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Toast.makeText(x.app(), ex.getMessage(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancelled(CancelledException cex) {
                Toast.makeText(x.app(), "cancell" +
                        "ed", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFinished() {

            }
        });
    }
}
