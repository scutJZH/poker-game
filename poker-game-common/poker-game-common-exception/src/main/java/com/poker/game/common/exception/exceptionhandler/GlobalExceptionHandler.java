package com.poker.game.common.exception.exceptionhandler;

import com.poker.game.common.exception.BaseException;
import com.poker.game.common.exception.BizException;
import com.poker.game.common.exception.errordefine.CommonErrorDefine;
import com.poker.game.common.exception.response.ErrorResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Locale;

@RestControllerAdvice
@RequiredArgsConstructor
@Slf4j
public class GlobalExceptionHandler {
    private final MessageSource pokerGameMessageSource;

    @ExceptionHandler(value = {BindException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleValidationExceptions(BindException e) {
        log.warn("params error:", e);
        return new ErrorResponse(CommonErrorDefine.PARAMS_ERROR.getCode(),
                getLocalMsg(CommonErrorDefine.PARAMS_ERROR.getCode()));
    }

    @ExceptionHandler(value = BizException.class)
    public ErrorResponse handleValidationExceptions(BizException e) {
        log.warn("biz error: code:{}, message", e.getCode());
        return new ErrorResponse(e.getCode(), getLocalMsg(e));
    }

    private String getLocalMsg(BaseException e) {
        Locale locale = LocaleContextHolder.getLocale();
        return pokerGameMessageSource.getMessage(e.getCode(), e.getArgs(), locale);
    }

    private String getLocalMsg(String key) {
        Locale locale = LocaleContextHolder.getLocale();
        return pokerGameMessageSource.getMessage(key, null, locale);
    }
}
