package com.kt.security.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Desc:
 *
 * @author: keen
 * Date: 2019-11-06
 * Time: 21:24
 */
@RestController
public class UserController {
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "hello" + name;
    }
}
