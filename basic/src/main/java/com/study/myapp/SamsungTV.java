package com.study.myapp;

public class SamsungTV implements TV {
	
//	private SonySpeaker speaker;	//초기화(생성자, setter 메소드) - 2.고장났다 치고 applespeaker 쓸거
//	private AppleSpeaker speaker;
	//매번 따로따로 만들어 쓸것이냐(위)
	
	//부모를 만들어서 한방에 만들어 쓸거냐 차이!(Speaker)
	private Speaker speaker;
	
	public SamsungTV() {		//default 생성자
		
	}
	
	
	public SamsungTV(Speaker speaker) {	//인자를 받는 생성자
		super();
		this.speaker = speaker;
	}
	
	// 초기화, 변경
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
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
