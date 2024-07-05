package com.poker.game.play.center.biz.controller;

import com.poker.game.play.center.api.TestApi;
import com.poker.game.play.center.api.TestDto;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController implements TestApi {
    @Override
    public void test(TestDto testDto) {
        System.out.println(testDto.getName());
    }
}
