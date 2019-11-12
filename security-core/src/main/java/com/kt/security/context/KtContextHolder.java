package com.kt.security.context;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Desc:
 *
 * @author: keen
 * Date: 2019-11-10
 * Time: 21:13
 */
public class KtContextHolder {
    private static KtContext ktContext;

    public static KtContext getKtContext() {
        return ktContext;
    }

    public static void setKtContext(KtContext ktContext) {
        KtContextHolder.ktContext = ktContext;
    }
}
