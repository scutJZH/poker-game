package com.poker.game.common.exception;

public abstract class BaseException extends RuntimeException {
    private final String code;
    private final int httpStatus;

    protected BaseException(ErrorDefine errorDefine, int httpStatus) {
        this.code = errorDefine.getCode();
        this.httpStatus = httpStatus;
    }

    protected BaseException(ErrorDefine errorDefine, int httpStatus, Throwable cause) {
        super(cause);
        this.code = errorDefine.getCode();
        this.httpStatus = httpStatus;
    }
}
