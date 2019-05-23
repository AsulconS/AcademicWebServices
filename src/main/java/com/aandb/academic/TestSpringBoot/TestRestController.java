package com.aandb.academic.TestSpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController
{
    @RequestMapping("/test")
    public String test()
    {
        return "Hello! This is awesome!";
    }
}
