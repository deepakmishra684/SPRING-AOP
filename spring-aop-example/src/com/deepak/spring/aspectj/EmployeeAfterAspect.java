package com.deepak.spring.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author Deepak
 *
 */
@Aspect
public class EmployeeAfterAspect {

	@After("execution(public * set*(..)) && args(paramValue)")
	public void logAfterMethodExecution(JoinPoint point, Object paramValue) {
		System.out.println("Value: " + paramValue);
		System.out.println("Executed: " + point.getSignature());
	}
}
