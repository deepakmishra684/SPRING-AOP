package com.deepak.spring.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author Deepak
 *
 */
@Aspect
public class EmployeeAfterReturningAspect {

	@AfterReturning(pointcut = "execution(public * get*())", returning = "retValue")
	public void logForReturnValue(JoinPoint point, Object retValue) {
		System.out.println("Returning value By " + point.getSignature());
		System.out.println("Value: " + retValue);
	}
}
