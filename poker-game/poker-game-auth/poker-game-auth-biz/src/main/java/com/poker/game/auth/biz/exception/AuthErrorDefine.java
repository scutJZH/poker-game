package com.poker.game.auth.biz.exception;

import com.poker.game.common.exception.ErrorDefine;
import lombok.Getter;

public enum AuthErrorDefine implements ErrorDefine {
//    /**
//     * 系统异常
//     */
//    INTERNAL_ERROR()

    /**
     * 业务异常：1001-9999
     */
    PHONE_NUMBER_HAS_ALREADY_BEEN_USED("1001"),
    ;

    private static final String CODE_PREFIX = "PokerGame.01.";

    @Getter
    private final String code;

    AuthErrorDefine(String code) {
        this.code = CODE_PREFIX + code;
    }
}
