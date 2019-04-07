package chy.aop;

import chy.spring.annotation.ChyComponent;
import chy.spring.annotation.aop.*;
import chy.spring.aop.ProceedingJoinPoint;

@ChyAspect
@ChyComponent
public class AopConfig2 {

    @ChyPointcut("public .* chy\\.service\\.MyService\\..*(.*)")
    public void pointcut(){}


    @ChyAfter("pointcut()")
    public void after(){
        System.out.println("执行了after方法^^^^^^^^^^^^^^^^^^^^^^^");
    }

    @ChyBefore("pointcut()")
    public void before(){
        System.out.println("执行了before方法^^^^^^^^^^^^^^^^^^^^^^^");

    }

    @ChyAround("pointcut()")
    public void aroud(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知开始2222222222");
        proceedingJoinPoint.proceed();
        System.out.println("环绕通知结束2222222222");
    }

}
