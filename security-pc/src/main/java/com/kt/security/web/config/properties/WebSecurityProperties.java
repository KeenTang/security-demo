package com.kt.security.web.config.properties;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * Desc:
 *
 * @author: keen
 * Date: 2019-11-10
 * Time: 21:27
 */
@Data
public class WebSecurityProperties {
    private String loginPage = "/test-login.html";
    private String registerPage = "/test-register.html";
    private String signOutRedirectUrl = "/demo-sign-out.html";
    private String loginProcessingUrl = "/authentication/form";
}
