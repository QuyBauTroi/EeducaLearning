package com.education.education.web.controller;


import com.tvd12.ezyhttp.server.core.annotation.Controller;
import com.tvd12.ezyhttp.server.core.annotation.DoGet;
import com.tvd12.ezyhttp.server.core.view.View;

import static org.youngmonkeys.ezyplatform.constant.CommonConstants.VIEW_VARIABLE_PAGE_TITLE;

@Controller
public class HomeController {

    @DoGet("/")
    public View homeGet() {
        return View.builder()
            .template("home")
            .addVariable(
                VIEW_VARIABLE_PAGE_TITLE,
                "home"
            )
            .build();
    }

    @DoGet("/course")
    public View courseGet() {
        return View.builder()
            .template("course")
            .addVariable(
                VIEW_VARIABLE_PAGE_TITLE,
                "course"
            )
            .build();
    }

    @DoGet("/blog")
    public View blogGet() {
        return View.builder()
            .template("blog")
            .addVariable(
                VIEW_VARIABLE_PAGE_TITLE,
                "blog"
            )
            .build();
    }

    @DoGet("/about-us")
    public View aboutGet() {
        return View.builder()
            .template("about-us")
            .addVariable(
                VIEW_VARIABLE_PAGE_TITLE,
                "about-us"
            )
            .build();
    }

    @DoGet("/contact-us")
    public View contactUsGet() {
        return View.builder()
            .template("contact-us")
            .addVariable(
                VIEW_VARIABLE_PAGE_TITLE,
                "contact-us"
            )
            .build();
    }
}
