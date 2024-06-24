package com.example.spring_boot_rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    // MARK: PointCut Syntax: - return-type class-name.method-name(args)

    // MARK: Before Advice

    @Before("execution(* com.example.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.example.spring_boot_rest.service.JobService.updateJob(..))")
    public void logMethodCall(JoinPoint joinPoint) {
        LOGGER.info("Method called " + joinPoint.getSignature().getName());
    }

    // MARK: After Advice

    @After("execution(* com.example.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.example.spring_boot_rest.service.JobService.updateJob(..))")
    public void logMethodExecuted(JoinPoint joinPoint) {
        LOGGER.info("Method executed " + joinPoint.getSignature().getName());
    }

    @AfterThrowing("execution(* com.example.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.example.spring_boot_rest.service.JobService.updateJob(..))")
    public void logMethodCrash(JoinPoint joinPoint) {
        LOGGER.info("Method has some issues " + joinPoint.getSignature().getName());
    }

    @AfterReturning("execution(* com.example.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.example.spring_boot_rest.service.JobService.updateJob(..))")
    public void logMethodExecutedSuccess(JoinPoint joinPoint) {
        LOGGER.info("Method executed successfully " + joinPoint.getSignature().getName());
    }
}
