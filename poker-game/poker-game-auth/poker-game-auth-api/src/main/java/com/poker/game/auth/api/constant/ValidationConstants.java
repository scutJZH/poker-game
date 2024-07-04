package com.poker.game.auth.api.constant;

public interface ValidationConstants {
    /**
     * 用户名最大长度
     */
    int USER_NICKNAME_MIN_SIZE = 4;

    /**
     * 用户名最大长度
     */
    int USER_NICKNAME_MAX_SIZE = 64;

    /**
     * 用户密码最小长度
     */
    int USER_PASSWORD_MIN_SIZE = 8;

    /**
     * 用户密码最大长度
     */
    int USER_PASSWORD_MAX_SIZE = 16;

    /**
     *
     */
    int MIN_USER_AGE = 0;

    int MAX_USER_AGE = 120;

    /**
     * 电话号码正则表达式
     */
    String USER_PHONE_NUMBER_REGEXP = "^1\\d{10}$";
}
