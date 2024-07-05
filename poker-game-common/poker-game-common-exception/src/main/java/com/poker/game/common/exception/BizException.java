package com.poker.game.common.exception;

import com.poker.game.common.exception.errordefine.ErrorDefine;
import org.springframework.http.HttpStatus;

/**
 * 业务异常
 */
public class BizException extends BaseException {
    private static final int BIZ_ERR_HTTP_STATUS = HttpStatus.BAD_REQUEST.value();

    public BizException(ErrorDefine errorDefine) {
        super(errorDefine, BIZ_ERR_HTTP_STATUS);
    }

    public BizException(ErrorDefine errorDefine, Object... args) {
        super(errorDefine, BIZ_ERR_HTTP_STATUS, args);
    }

    public BizException(ErrorDefine errorDefine, Throwable cause, Object... args) {
        super(errorDefine, BIZ_ERR_HTTP_STATUS, cause, args);
    }

    public BizException(ErrorDefine errorDefine, Throwable cause) {
        super(errorDefine, BIZ_ERR_HTTP_STATUS, cause);
    }
}
