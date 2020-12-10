package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:${environment}.properties"
})
public interface WebConfig extends Config {
    @Key("password")
    String searchPassword();

    @Key("search.site")
    String searchSite();

    @Key("search.item")
    String searchItem();

    @Key("search.result")
    String searchResult();

    @Key("webdriver.remote")
    String webdriverRemote();
}
