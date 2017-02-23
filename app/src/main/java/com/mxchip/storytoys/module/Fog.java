package com.mxchip.storytoys.module;

import android.content.Context;

import com.alibaba.fastjson.JSONObject;
import com.mxchip.storytoys.helper.XUtilesTool;
import com.taobao.weex.bridge.WXBridgeManager;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SIN on 2016/12/16.
 */

public class Fog extends WXModule {

    private Context mContext = null;
    private String instanceId = null;

    private void initFog(){
        if(null == mContext){
            mContext = mWXSDKInstance.getContext();
        }
        if(null == instanceId) {
            instanceId = mWXSDKInstance.getInstanceId();
        }
    }

    @WXModuleAnno
    public void toasts(JSONObject parameters, String callbackId){

//        if (!CheckTool.checkPara(callbackId))
//            return;
//
//        initFog();
//        Toast.makeText(mWXSDKInstance.getContext(),parameters.getString("token"), Toast.LENGTH_SHORT).show();
//        exeCallBack(callbackId, getResult(0, parameters.getString("token")+" tt88"), false);

        XUtilesTool xut = new XUtilesTool();
        xut.getHttp();

    }

    /**
     * Return the Map from code and message.
     *
     * @param code    code of onSuccess/onFailure
     * @param message message of onSuccess/onFailure
     * @return String map
     */
    private Map<String, Object> getResult(int code, String message) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", code);
        result.put("message", message);
        return result;
    }

    /**
     * Call back to js.
     *
     * @param callbackId callback referenece handle
     * @param message    callback data
     * @param keepAlive  if keep callback instance alive for later use
     */
    private void exeCallBack(String callbackId, Map<String, Object> message, boolean keepAlive) {
        WXBridgeManager.getInstance().callback(instanceId, callbackId, message, keepAlive);
    }
}
