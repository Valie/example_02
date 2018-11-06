package com.ribbon_service.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


/**
 * @Description TODO
 * @Author Takioo
 * @Date 2018/11/5 16:11
 **/

@RestController
public class HelloControl {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hi")
    public void hiAction() {

        for (int i = 0; i < 4; i ++) {

            String line = restTemplate.getForEntity("http://ASERVICE/hello",
                    String.class).getBody() + "\t" +
                    "time: " + System.currentTimeMillis();

            System.out.println(line);
        }

    }

}
