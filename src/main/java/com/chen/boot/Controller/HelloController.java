package com.chen.boot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @date 2021/3/18 8:57
 * @Author xiaochen
 */
//@controller
//@ResponseBody

@RestController//代替上面的两个注解
public class HelloController {

    @RequestMapping("/hello")
    public String handler01() {
        return "Hello SpringBoot2!";
    }

}
