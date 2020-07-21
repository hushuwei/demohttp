package com.hsw.demohttp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(value = "/people")
    public People getPeople(){
        People people = new People();
        people.setName("王二123的");
        people.setAge(20);
        people.setSex("男");
        return people;
    }
}
