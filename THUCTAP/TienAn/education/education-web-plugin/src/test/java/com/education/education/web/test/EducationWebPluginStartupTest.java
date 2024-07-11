package com.education.education.web.test;

import com.tvd12.ezyhttp.server.boot.EzyHttpApplicationBootstrap;
import com.tvd12.ezyhttp.server.core.annotation.ComponentsScan;
import com.tvd12.ezyhttp.server.core.annotation.PropertiesSources;

@PropertiesSources({
    "config.properties",
    "setup.properties"
})
@ComponentsScan({
    "org.youngmonkeys.ezyplatform",
    "com.education.education",
    "org.youngmonkeys.ezyarticle",
    "org.youngmonkeys.ezymail",
    "org.youngmonkeys.ezysupport"
})
public class EducationWebPluginStartupTest {

    public static void main(String[] args) throws Exception {
        EzyHttpApplicationBootstrap.start(EducationWebPluginStartupTest.class);
    }
}
