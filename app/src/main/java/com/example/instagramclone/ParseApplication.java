package com.example.instagramclone;


import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        // ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId(getResources().getString(R.string.applicationId))
                .clientKey(getResources().getString(R.string.clientKey))
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
