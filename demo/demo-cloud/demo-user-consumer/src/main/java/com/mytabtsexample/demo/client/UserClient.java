package com.mytabtsexample.demo.client;

import com.mytabtsexample.demo.pojo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("user-service")
public interface UserClient {

    @GetMapping("/userService/{id}")
    User queryById(@PathVariable("id") Long id);

}
