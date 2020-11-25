package org.mouatamid.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;

@Aspect
public class ServiceAspect {
    @Before("@annotation(org.mouatamid.annotation.ServiceGet)")
    public void beforeGetAspect(JoinPoint joinPoint){
        System.out.println("Before service getters aspect...Method executed : " + joinPoint.toString());
    }
    @After("@annotation(org.mouatamid.annotation.ServiceSet)")
    public void afterSetAspect(JoinPoint joinPoint){
        System.out.println("After service setters aspect...Method executed : " + joinPoint.toString() + "...Arguments passed : " + Arrays.toString(joinPoint.getArgs()));
    }
}
