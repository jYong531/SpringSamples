package com.pingan.simple.GlobalException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {
    @RequestMapping(value = "/exception/{number}")
    public ApiResult exception(@PathVariable int number) {
        int res = 10 / number;
        return ApiResult.ok();
    }
}
