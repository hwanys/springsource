package com.study.myapp;

public class TVMain {

	public static void main(String[] args) {
		//TV tv = new SamsungTV(new SonySpeaker());
		
		SamsungTV tv = new SamsungTV();
		
//		tv.setSpeaker(new SonySpeaker()); // setter이용 초기화
		tv.setSpeaker(new AppleSpeaker());
		
		tv.powerOn();
		tv.volumeUp();
		tv.powerOff();
		
//		String str = null;
//		System.out.println(str);
//		System.out.println(str.toString());
	}

}
