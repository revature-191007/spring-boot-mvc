package com.revature.entities;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.revature.models.Puppy;

@Aspect
@Component
public class LoggerAspect {

	@Before("within(com.revature..*)")
	public void logMethodCall(JoinPoint jp) {
		System.out.println("Calling method: " + jp.getSignature());
	}
	
	@After("within(com.revature..*)")
	public void logMethodCallAfter(JoinPoint jp) {
		System.out.println("Returning from: " + jp.getSignature());
	}
	
	@Around("execution(com.revature.models.Puppy com.revature.services..*())")
	public Puppy interceptPuppy(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Intercepting Puppy.");
		Puppy puppy = (Puppy) pjp.proceed();
		puppy.setName("Yell'r");
		return new Puppy(5, "Replacement Yell'r");
	}
}
