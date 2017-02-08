package application;

import android.app.Application;

import com.taobao.weex.InitConfig;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;

import adapter.ImageAdapter;

/**
 * Created by wondercupid on 2017/1/27.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        int abc = 1;
        super.onCreate();
        WXEnvironment.addCustomOptions("appName","TBSample");
        WXSDKEngine.initialize(this,new InitConfig.Builder()
                .setImgAdapter(new ImageAdapter())
                .build());
    }

}
