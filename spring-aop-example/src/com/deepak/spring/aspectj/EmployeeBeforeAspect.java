package com.deepak.spring.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author Deepak
 *
 */
@Aspect
public class EmployeeBeforeAspect {

	// Execute Before All public business Methods
	@Before("execution(public * *(..))")
	public void logBeforeEmployee(JoinPoint point) {
		System.out.println("Start Execution of " + point.getSignature());
	}
}
