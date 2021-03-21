package com.amdocs.core.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

@Config.Sources("classpath:${environment}.properties")
public interface UITestsConfig extends Config {
    UITestsConfig DEV_CONFIG = ConfigFactory.create(UITestsConfig.class);

    @Key("baseUrl")
    String getBaseUrl();

    @Key("browser.name")
    String getBrowserName();

    @Key("browser.version")
    int getBrowserVersion();

    @Key("remote.driver.user")
    String getRemoteDriverUser();

    @Key("remote.driver.password")
    String getRemoteDriverPassword();
}
