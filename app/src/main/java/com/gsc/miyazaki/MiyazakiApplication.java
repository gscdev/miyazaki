package com.gsc.miyazaki;

import android.app.Application;

import com.gsc.miyazaki.di.components.AppComponent;
import com.gsc.miyazaki.di.components.DaggerAppComponent;
import com.gsc.miyazaki.di.modules.AppModule;


public class MiyazakiApplication extends Application {

    private static AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = buildComponent();
    }

    protected AppComponent buildComponent() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public static AppComponent getComponent() {
        return component;
    }

}
