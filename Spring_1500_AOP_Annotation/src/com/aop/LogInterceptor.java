package com.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogInterceptor {
    @Pointcut("execution(public * com.service..*.addUser(..))")
    public void myMethod(){}
    @Before("myMethod()")
    public void before(){
        System.out.println("method start!!!!");
    }

    @AfterReturning("myMethod()")
    public void afterReturnning() {
        System.out.println("method after returnning！！！");
    }

    @AfterThrowing("myMethod()")
    public void afterThrowing() {
        System.out.println("method after throwing!!!");
    }

    @Around("myMethod()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("method around start!!!");
        proceedingJoinPoint.proceed();
        System.out.println("method around end!!!");
    }


}

