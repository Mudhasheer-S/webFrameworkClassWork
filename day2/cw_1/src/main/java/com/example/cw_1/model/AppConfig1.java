package com.example.cw_1.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {
    
    @Value("${app.name}")
    private String appName;
    @Value("${app.version}")
    private String appVersion;

    public AppConfig1(){

    }

    public AppConfig1(String appName, String appVersion) {
        this.appName = appName;
        this.appVersion = appVersion;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    
}
