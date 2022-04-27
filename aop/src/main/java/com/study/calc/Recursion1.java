package com.study.calc;

/*
재귀호출로 factorial 구현
재귀호출 : 메소드 안에서 자신의 메소드를 다시 호출  (기본단계 없을 시 무한 루프에 빠질 수 있음)
         기본단계와 재귀단계로 나뉨
*/ 
public class Recursion1 {
	public static void main(String[] args) {
		int num = 4;
		func(num);
	}
	public static void func(int n) {
		if(n > 0) {	//재귀단계
			System.out.println("Hello");
			func(n-1);
		}else { //기본단계
			return;
		}
	}

	
	
//void countdown(int i) {
//
//if(i >= 0) {
//	//기본 단계
//	return;
//}else {
//	//재귀 단계
//	countdown(i-1);			
//}
//
//}
}