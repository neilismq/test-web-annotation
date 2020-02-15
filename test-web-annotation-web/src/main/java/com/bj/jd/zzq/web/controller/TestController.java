package com.bj.jd.zzq.web.controller;

import com.bj.jd.zzq.common.CommonResponse;
import com.bj.jd.zzq.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 请填写类的描述
 *
 * @author zhaozhiqiang35
 * @date 2020-02-14 19:37
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/hello")
    @ResponseBody
    public CommonResponse sayHi() {
        return new CommonResponse().buildSuccess(testService.sayHi());
    }
}
