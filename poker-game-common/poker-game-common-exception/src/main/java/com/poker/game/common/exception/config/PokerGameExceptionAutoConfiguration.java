package com.poker.game.common.exception.config;

import com.poker.game.common.exception.exceptionhandler.GlobalExceptionHandler;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Import;

@AutoConfiguration
@Import({GlobalExceptionHandler.class, MessageSourceConfiguration.class})
public class PokerGameExceptionAutoConfiguration {
}
