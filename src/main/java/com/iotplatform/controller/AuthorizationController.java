package com.iotplatform.controller;

import com.iotplatform.service.AuthorizationService;
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

    /**
     * @Description 鉴权
     * @author xiebifeng
     * @date 2019/1/3 19:42
     * @param: []
     * @return: java.lang.Boolean
     */
    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public Boolean reg() {
        return service.getAccessToken();
    }

    /**
     * @Description 刷新验证
     * @author xiebifeng
     * @date 2019/1/3 19:42
     * @param: []
     * @return: java.lang.Boolean
     */
    @RequestMapping(value = "/refreshToken", method = RequestMethod.POST)
    public Boolean refreshToken() {
        return service.refreshToken();
    }
}
