package com.poker.game.play.center.api;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface TestApi {
    @PostMapping("/test")
    void test(@RequestBody @Validated TestDto testDto);
}
