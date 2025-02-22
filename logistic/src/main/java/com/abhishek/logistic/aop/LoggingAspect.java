package com.abhishek.logistic.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    @Before(("execution(* com.abhishek.logistic.controller.ProductController.*(..))"))
    public void logBeforeControllerMethod() {
        log.info("Method is invoked in controller method");
    }

}
