package com.zhqstudy.yilimusic.yilimusic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DefaultController
 * @Date 2022/3/7 16:29
 * @Description TODO
 */
@RestController
@RequestMapping("/hello")
public class DefaultController {

    @GetMapping
    public String sayHello(){
        return "欢迎程序员的音乐盒";
    }
}
