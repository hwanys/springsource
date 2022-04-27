package com.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.study.mapper.SampleMapper1;
import com.study.mapper.SampleMapper2;

@Service("service")
public class SampleServiceImpl implements SampleService {
	
	@Autowired
	private SampleMapper1 mapper1;
	
	@Autowired
	private SampleMapper2 mapper2;
	
	@Transactional
	@Override
	public void addData(String data) {		//하나의 메소드에서 두개의 mapper로 가도록 해놓음
		// transaction 처리 -> commit할거면 둘다 commit, rollback 할거면 둘다 rollback하도록! 한놈만 살순없음
		mapper1.insertCol1(data);
		mapper2.insertCol2(data);

	}

}
