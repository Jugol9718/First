package com.controller;

import com.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zlp
 * @date 14:59  2019/10/22
 */
@Controller
@RequestMapping(value = "test")
public class TestController {

    @GetMapping(value = "test")
    @ResponseBody
    public String test(){
        Student student = new Student();
        return "student";
    }

}
