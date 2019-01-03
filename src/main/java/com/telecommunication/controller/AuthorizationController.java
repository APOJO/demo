package com.telecommunication.controller;

import com.telecommunication.service.AuthorizationService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName AuthorizationController
 * @Description
 * @Author xiebifeng
 * @Date 2019/1/3 17:30
 */

@RequestMapping("/auth")
@Api(tags = "鉴权")
@RestController
public class AuthorizationController {
    @Autowired
    private AuthorizationService service;
    @RequestMapping(value = "/reg",method = RequestMethod.POST)
    public Boolean getres(){
        return service.getAccessToken();
    }
}
