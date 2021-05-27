package com.kodilla.facade;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Aspect
@Component
public class Logger {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Logger.class);

    @Before("execution(* com.kodilla.facade.api.OrderFacade.processOrder(..))")
    public void logEvent() {
        LOGGER.info("LOGGER DZIAŁA");
    }
}
