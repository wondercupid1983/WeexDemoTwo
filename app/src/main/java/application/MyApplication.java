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

        super.onCreate();
        WXEnvironment.addCustomOptions("appName","TBSample");
        WXSDKEngine.initialize(this,new InitConfig.Builder()
                .setImgAdapter(new ImageAdapter())
                .build());
        int abc = 1;
        if (abc < 5);
        //ljljlj add 666
    }

}
