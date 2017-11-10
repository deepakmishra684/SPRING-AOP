package com.deepak.spring.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author Deepak
 *
 */
@Aspect
public class EmployeeAroundAspect {

	// Execute Around all public Setter business Methods
	// We can use ProceedingJoinPoint with Around only
	@Around("execution(public * get*())")
	public Object logAroundEmployee(ProceedingJoinPoint pjp) {
		System.out.println("Before Execution: " + pjp.getSignature());
		Object obj = null;
		try {
			obj = pjp.proceed();
		} catch (Throwable ex) { // Must pass Throwable
			ex.printStackTrace();
		}
		System.out.println("After Execution: " + pjp.getSignature());
		return obj;
	}
}
