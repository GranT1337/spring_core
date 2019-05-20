package org.shop.aop;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
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
public class LoggingAspect {
    private static final Logger logger = Logger.getLogger(LoggingAspect.class);

    @Pointcut("@annotation(org.shop.annotations.LoggingAnnotation)")
    public void loggingMethod() {

    }

    @Before("loggingMethod()")
    public void beforeCallLoggingMethod(JoinPoint joinPoint) {
        Signature methodName = joinPoint.getSignature();
        logger.info(methodName.getName() + " " + methodName.getDeclaringTypeName());
    }

}
