package com.divitiae.wastatussave;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.divitiae.wastatussave.util.AdController;
import com.divitiae.wastatussave.util.AppOpenManager;
import com.onesignal.OneSignal;

public class MyApp extends Application {

    AppOpenManager appOpenManager;
    private static final String ONESIGNAL_APP_ID = "0f384207-e37d-4e7c-bfd7-25ba97d7947c";

    @Override
    public void onCreate() {
        super.onCreate();
        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);


        AdController.initAd(this);


        appOpenManager = new AppOpenManager(this);
    }
}
