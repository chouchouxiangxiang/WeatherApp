package com.example.weatherapp.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    private static String TAG = "HttpUtil";

    //传入请求地址，并注册一个回调来处理服务器响应
    public static void sendOKHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build(); //注册一个回调
        client.newCall(request).enqueue(callback);
    }
}
