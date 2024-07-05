package com.poker.game.common.exception;

import com.poker.game.common.exception.errordefine.ErrorDefine;
import org.springframework.http.HttpStatus;

public class SystemException extends BaseException {
    private static final int SYSTEM_ERR_HTTP_STATUS = HttpStatus.INTERNAL_SERVER_ERROR.value();

    public SystemException(ErrorDefine errorDefine) {
        super(errorDefine, SYSTEM_ERR_HTTP_STATUS);
    }

    public SystemException(ErrorDefine errorDefine, Object... args) {
        super(errorDefine, SYSTEM_ERR_HTTP_STATUS, args);
    }

    public SystemException(ErrorDefine errorDefine, Throwable cause, Object... args) {
        super(errorDefine, SYSTEM_ERR_HTTP_STATUS, cause, args);
    }

    public SystemException(ErrorDefine errorDefine, Throwable cause) {
        super(errorDefine, SYSTEM_ERR_HTTP_STATUS, cause);
    }
}
