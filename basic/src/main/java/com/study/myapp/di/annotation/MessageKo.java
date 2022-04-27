package com.study.myapp.di.annotation;

public class MessageKo implements Message {

	@Override
	public void sayHello(String name) {
		System.out.println("Hello"+name+" 님");

	}

}
