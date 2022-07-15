package com.wjalong.longuser.user.controller;


import com.wjalong.common.ResultMsg;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yixin
 * @since 2022-07-14
 */
@RestController
@RequestMapping("/user")
public class BlogUserController {

    @PostMapping("/test")
    public ResultMsg<String> test() {
        return ResultMsg.ok("111");
    }
}

