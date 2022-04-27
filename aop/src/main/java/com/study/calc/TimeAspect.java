package com.study.calc;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeAspect {
	
	@Around(value="execution(* com.study.calc..*(..))") //forcalc,recCalc 둘다 들어가야하니깐 ..*로 표시.
	public Object measure(ProceedingJoinPoint pjp) throws Throwable{
		//수행 전
		long start = System.nanoTime();	//시간 재기 (시작)
		
		try { //메소드 호출
			Object obj = pjp.proceed();	//뭐가들어올지 모르니깐 Object 타입으로
			return obj;
		} finally {
			//수행 후
			long end = System.nanoTime();	//시간 재기 (끝)
			System.out.println("걸린시간 : "+(end-start));
		}
	}
}







