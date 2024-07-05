package com.poker.game.common.exception;

import com.poker.game.common.exception.errordefine.ErrorDefine;
import lombok.Getter;

@Getter
public abstract class BaseException extends RuntimeException {
    private final String code;
    private final int httpStatus;
    private final Object[] args;

    protected BaseException(ErrorDefine errorDefine, int httpStatus) {
        this(errorDefine, httpStatus, null, (Object) null);
    }

    protected BaseException(ErrorDefine errorDefine, int httpStatus, Object... args) {
        this(errorDefine, httpStatus, null, args);
    }

    protected BaseException(ErrorDefine errorDefine, int httpStatus, Throwable cause) {
        this(errorDefine, httpStatus, cause, (Object) null);
    }

    protected BaseException(ErrorDefine errorDefine, int httpStatus, Throwable cause, Object... args) {
        super(cause);
        this.code = errorDefine.getCode();
        this.httpStatus = httpStatus;
        this.args = args;
    }
}
