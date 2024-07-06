package com.poker.game.common.exception.errordefine;

import lombok.Getter;

public enum CommonErrorDefine implements ErrorDefine {
    /**
     * 通用参数错误码
     */
    PARAMS_ERROR("0400"),

    /**
     * 系统异常错误码
     */
    INTERNAL_ERROR("0500");

    private static final String CODE_PREFIX = "PokerGame.00.";

    private final String code;

    CommonErrorDefine(String code) {
        this.code = code;
    }

    @Override
    public String getCode() {
        return CODE_PREFIX + this.code;
    }
}
