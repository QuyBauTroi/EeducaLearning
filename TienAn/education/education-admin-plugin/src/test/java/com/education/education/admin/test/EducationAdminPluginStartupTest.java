package com.education.education.admin.test;

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
public class EducationAdminPluginStartupTest {

    public static void main(String[] args) throws Exception {
        EzyHttpApplicationBootstrap.start(EducationAdminPluginStartupTest.class);
    }
}
