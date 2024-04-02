package org.kosa.hello.service;

import org.kosa.hello.mapper.TimeMapper;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TimeServiceImpl implements TimeService {
    private final TimeMapper timeMapper;

	@Override
	public String getNow() {
		// TODO Auto-generated method stub
		return timeMapper.getNow();
	}
	
}
