package org.apache.cordova.toastdemo;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.widget.Toast;

/**
 * This class echoes a string called from JavaScript.
 */
public class ToastDemo extends CordovaPlugin {

    /** 
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("showToast")) {
            String message = args.getString(0);
            this.showToast(message, callbackContext);
            return true;
        }
        return false;
    }

    private void showToast(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            Toast.makeText(cordova.getContext(), message, Toast.LENGTH_SHORT).show(); // 调用android原生Toast
            callbackContext.success(message); // 设置成功回调信息
        } else {
            callbackContext.error("Expected one non-empty string argument."); // 设置失败回调信息
        }
    }
    */

    @Override
    public boolean execute(String action, CordovaArgs args, CallbackContext callbackContext) throws JSONException {
        if ("show".equals(action)){
            // 获取activity和context --> cordova.getActivity()和cordova.getContext()
            Toast.makeText(cordova.getContext(),args.getString(0),Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}
