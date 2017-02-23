package com.mxchip.kaleido.module;

import android.util.Log;
import android.widget.Toast;

import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;

public class FogToast extends WXModule {

  @WXModuleAnno(runOnUIThread = true)
  public void printLog(String msg) {
    Log.d("---fog---", msg);
    Toast.makeText(mWXSDKInstance.getContext(),msg, Toast.LENGTH_SHORT).show();
  }
}
