package com.fredom.fureria.controller;

import com.fredom.fureria.consts.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author fredom
 * @Date 2022/9/13 21:07
 * @Version 1.0
 */
@RequestMapping("Demo")
@RestController
public class Demo {
    @RequestMapping("")
    public R<String> demo(@RequestParam(value = "name",defaultValue = "guest")String name){
        return R.ok("Hallo,"+name);
    }
}
