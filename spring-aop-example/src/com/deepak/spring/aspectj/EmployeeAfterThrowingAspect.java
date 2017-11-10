package com.deepak.spring.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAfterThrowingAspect {

	@AfterThrowing(pointcut="execution(public * throw*(..))",throwing="ex")
	public void exceptionLogForCustomer(JoinPoint point, Throwable ex){
		System.out.println("Exception Throw by:"+point.getSignature());
		System.out.println(ex.getMessage());
	}
}
