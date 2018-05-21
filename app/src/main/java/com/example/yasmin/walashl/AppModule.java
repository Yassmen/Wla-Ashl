package com.example.yasmin.walashl;

import android.app.Application;

import com.example.yasmin.walashl.utils.PreferenceHelper;

import javax.inject.Singleton;

import dagger.Provides;

public class AppModule {
    private Application app;
    AppModule(Application app) {
        this.app = app;
    }

    @Singleton
    @Provides
    PreferenceHelper providesPreferenceHelper() {
        return new PreferenceHelper(app);
    }

}
