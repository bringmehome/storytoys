package com.mxchip.storytoys.helper;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXRenderStrategy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by SIN on 2016/11/17.
 */

public class RenderPage {
    private WXSDKInstance mInstance;
    private String mPageName;

    public RenderPage(AppCompatActivity context, WXSDKInstance instance, String pageName) {
        this.mInstance = instance;
        this.mPageName = pageName;
    }


    /**
     * 打开远程的weex文件
     */
    public void openWXUrl(String url) {
        mInstance.renderByUrl(
                mPageName,
                url,
                new HashMap<String, Object>(),
                null,
//                ScreenUtil.getDisplayWidth(mContext),
//                ScreenUtil.getDisplayHeight(mContext),
                WXRenderStrategy.APPEND_ASYNC);
    }

    /**
     * 打开本地的文件
     * 需要获取权限，6.0版本需要手动授权
     */
    public void openLocalFile() {
        //加载本地的js
        File f = new File(Environment.getExternalStorageDirectory() + "/kaleido/index.js");
        mInstance.render(mPageName,
                ReadTxtFile(f.toString()),
                new HashMap<String, Object>(),
                null,
//                ScreenUtil.getDisplayWidth(mContext),
//                ScreenUtil.getDisplayHeight(mContext),
                WXRenderStrategy.APPEND_ASYNC);

////        下载文件
//        UpdateWeexJs uweexjs = new UpdateWeexJs();
//        uweexjs.doDownload();
    }

    //读取文本文件中的内容
    public static String ReadTxtFile(String strFilePath) {
        String path = strFilePath;
        String content = ""; //文件内容字符串
        //打开文件
        File file = new File(path);
        //如果path是传递过来的参数，可以做一个非目录的判断
        if (file.isDirectory()) {
            Log.d("TestFile", "The File doesn't not exist.");
        } else {
            try {
                InputStream instream = new FileInputStream(file);
                if (instream != null) {
                    InputStreamReader inputreader = new InputStreamReader(instream);
                    BufferedReader buffreader = new BufferedReader(inputreader);
                    String line;
                    //分行读取
                    while ((line = buffreader.readLine()) != null) {
                        content += line + "\n";
                    }
                    instream.close();
                }
            } catch (java.io.FileNotFoundException e) {
                Log.d("TestFile", "The File doesn't not exist.");
            } catch (IOException e) {
                Log.d("TestFile", e.getMessage());
            }
        }
        Log.d("---TestFile---", content);
        return content;
    }
}
