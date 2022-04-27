package com.study.myapp.di.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("samsung")
public class SamsungTV implements TV {
	
	@Autowired
	@Qualifier("apple")
	private Speaker speaker;
	
//	public SamsungTV() {		//default 생성자
//		
//	}
//	
//	
//	public SamsungTV(Speaker speaker) {	//인자를 받는 생성자
//		super();
//		this.speaker = speaker;
//	}
//	
//	// 초기화, 변경
//	public void setSpeaker(Speaker speaker) {
//		this.speaker = speaker;
//	}
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV 전원 On");

	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV 전원 off");

	}

	@Override
	public void volumeUp() {
//		System.out.println("SamsungTV Volume Up");
		speaker.volumeUp();		// 여기가 NullPointerException 발생시 speaker이 null일거라 생각하기.

	}

	@Override
	public void volumeDown() {
//		System.out.println("SamsungTV Volume Down");
		speaker.volumeDown();

	}

}
