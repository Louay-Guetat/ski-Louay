package tn.esprit.ds.skilouay.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Slf4j
@Aspect
@Component
public class LoggingAspects {
    @Before("execution(public * tn.esprit.ds.skilouay.services.*.*(..))")
    public void inMethod(JoinPoint jp)
    {
        log.info("in method"+jp.getSignature().getName());
    }
    @AfterReturning("execution(public * tn.esprit.ds.skilouay.services.*.*(..))")
    public void outMethod(JoinPoint jp)
    {
        log.info("out method"+jp.getSignature().getName());
    }

}
