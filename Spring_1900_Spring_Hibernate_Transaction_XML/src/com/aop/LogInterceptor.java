package com.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogInterceptor {
    public void before(){
        System.out.println("method start!!!!");
    }

    public void afterReturnning() {
        System.out.println("method after returnning！！！");
    }

    public void afterThrowing() {
        System.out.println("method after throwing!!!");
    }

    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("method around start!!!");
        proceedingJoinPoint.proceed();
        System.out.println("method around end!!!");
    }


}

