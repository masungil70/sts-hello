package com.sts.hello.mapper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.kosa.hello.mapper.TimeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class TimeMapperTests {

    @Autowired(required = false)
    private TimeMapper timeMapper;

    @Test
    public void testNow() {
        log.info(timeMapper.getNow());
    }

}

