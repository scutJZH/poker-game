package com.poker.game.common.util.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SecurityHelper {
    private static final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    /**
     * bcrypt加密
     *
     * @param str str
     * @return encryptedStr
     */
    public static String bcrypt(String str) {
        return bCryptPasswordEncoder.encode(str);
    }
}
