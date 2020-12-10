package config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigHelper {

    public static String getPassword() {
        return getConfig().searchPassword();
    }

    public static String getSearchSite() {
        return getConfig().searchSite();
    }

    public static String getSearchItem() {
        return getConfig().searchItem();
    }

    public static String getSearchResult() {
        return getConfig().searchResult();
    }

    public static String getWebdriverRemote() {
        return getConfig().webdriverRemote();
    }

    private static WebConfig getConfig() {
        if (System.getProperty("environment") == null) System.setProperty("environment", "prod"); // test, preprod

        return ConfigFactory.newInstance().create(WebConfig.class, System.getProperties());
    }

}
