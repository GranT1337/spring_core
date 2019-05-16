package org.shop.aop;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Collectors;

@Aspect
@Component
public class MyAspect {
    private Logger logger = Logger.getLogger(this.getClass());

    @Pointcut("execution(* org.shop.repository.map..*(..))")
    public void callAtMyServicePublic() {

    }

    @Before("callAtMyServicePublic()")
    public void beforeCallAtMethod1() {
        logger.info("LoL");
    }

}
