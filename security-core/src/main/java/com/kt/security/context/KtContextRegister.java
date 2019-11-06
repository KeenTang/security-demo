package com.kt.security.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Desc:
 *
 * @author: keen
 * Date: 2019-11-06
 * Time: 22:32
 */
@Component
public class KtContextRegister implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        KtContext ktContext = new KtContext();
        ktContext.setApplicationContext(applicationContext);
    }
}
