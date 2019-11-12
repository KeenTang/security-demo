package com.kt.security.web.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * Desc:
 *
 * @author: keen
 * Date: 2019-11-10
 * Time: 21:08
 */
@Configuration
@ConfigurationProperties(prefix = "kt.security")
@Data
public class KtSecurityProperties {
    private WebSecurityProperties web=new WebSecurityProperties();
}
