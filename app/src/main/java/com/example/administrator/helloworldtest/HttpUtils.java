package com.example.administrator.helloworldtest;

import android.util.Log;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtils {

    private static final String TAG = "HttpUtils";
    private static  String httpJsonString;

    public HttpUtils() {
                 // TODO Auto-generated constructor stub
             }
             public static String getJsonContent(String url_path) {

                try {
                         URL url = new URL(url_path);
                         HttpURLConnection connection = (HttpURLConnection) url
                                 .openConnection();
                         connection.setConnectTimeout(3000);
                         connection.setRequestMethod("GET");
                         connection.setDoInput(true);
                         int code = connection.getResponseCode();
                         if (code == 200) {
                             httpJsonString = changeInputStream(connection.getInputStream());
                             Log.v(TAG,"jsonString1:"+httpJsonString);
                                 //return changeInputStream(connection.getInputStream());
                             }
                     } catch (Exception e) {
                         // TODO: handle exception
                            Log.e(TAG,e.getMessage());
                     }
                 return httpJsonString;
             }

             private static String changeInputStream(InputStream inputStream) {
                 // TODO Auto-generated method stub
                 String jsonString = "";
                 ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                 int len = 0;
                 byte[] data = new byte[10240];
                 try {
                         while ((len = inputStream.read(data)) != -1) {
                                outputStream.write(data, 0, len);
                             }
                         jsonString = new String(outputStream.toByteArray());
                     Log.i(TAG,"jsonString2:"+jsonString);
                    } catch (IOException e) {
                         // TODO Auto-generated catch block
                        e.printStackTrace();
                     }
                     Log.i(TAG,"jsonString4:"+jsonString);
                 return jsonString;
             }
}
