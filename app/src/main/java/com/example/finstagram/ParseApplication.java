package com.example.finstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("DPq3RmUh5Ky9rcQzNSjxv7ThM344HDbIzp5hkrb7")
                .clientKey("SoX7vy1D768o4TeO1BMbokorOH6Q0M5EhXU5JJtn")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
