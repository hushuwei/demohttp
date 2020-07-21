package com.hsw.demohttp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(value = "/people")
    public People getPeople(){
        People people = new People();
        people.setName("赵四");
        people.setAge(2000);
        people.setSex("男");
        return people;
    }
}
