package com.example.demo_helloworld.leiZhang;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/layout")
public class HelloWorldController {
    private static final String MESSAGE_1 = "HELLOWORLD!";

    private static final String MESSAGE_2 = "BOOTSpring!";

    @GetMapping(value = "/faceToWorld/{testMessage}")
    public String see(@PathVariable String testMessage) {
        System.out.println("hey");
        return StringUtils.equals(MESSAGE_1, testMessage) ? MESSAGE_1 : MESSAGE_2;
    }
}
