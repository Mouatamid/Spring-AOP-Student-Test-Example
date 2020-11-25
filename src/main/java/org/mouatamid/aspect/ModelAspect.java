package org.mouatamid.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;

@Aspect
public class ModelAspect {
    @Before("@annotation(org.mouatamid.annotation.ModelGet)")
    public void beforeGetAspect(JoinPoint joinPoint){
        System.out.println("Before model getters aspect...Method executed : " + joinPoint.toString());
    }
    @Before("@annotation(org.mouatamid.annotation.ModelSet)")
    public void beforeSetAspect(JoinPoint joinPoint){
        System.out.println("Before model setters aspect...Method executed : " + joinPoint.toString() + "...Arguments passed : " + Arrays.toString(joinPoint.getArgs()));
    }
    @After("@annotation(org.mouatamid.annotation.ModelGet)")
    public void afterGetAspect(){
        System.out.println("After model getters aspect");
    }
    @After("@annotation(org.mouatamid.annotation.ModelSet)")
    public void afterSetAspect(){
        System.out.println("After model setters aspect");
    }
    @Around("execution(public String toString())")
    public Object aroundAspectMethod(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("Around advice...");
        Object object = null;
        try {
            object = proceedingJoinPoint.proceed();
        }catch (Throwable e){
            e.printStackTrace();
        }
        System.out.println("toString() : " + object);
        return object;
    }
}
