package com.poker.game.common.exception;

import org.springframework.http.HttpStatus;

/**
 * 业务异常
 */
public class BizException extends BaseException {
    public BizException(ErrorDefine errorDefine) {
        super(errorDefine, HttpStatus.BAD_REQUEST.value());
    }

    public BizException(ErrorDefine errorDefine, Throwable cause) {
        super(errorDefine, HttpStatus.BAD_REQUEST.value(), cause);
    }
}
