package com.example.ribbondemo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonDemoTest {
//    @Autowired
//    private LoadBalancerClient client;


    @RequestMapping("/test")
    public String RibbonDemo(){

//        ServiceInstance instance = client.choose("PROVIDER-SERVER");
//        System.out.println(instance.getHost() + " ==:== " + instance.getPort() + " ==:== " + instance.getServiceId() + " ==:== " + instance.getUri().toString());

        return "ok";
    }
}

