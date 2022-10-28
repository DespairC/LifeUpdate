package com.hwh.lifeupdate;

import com.hwh.lifeupdate.mapper.TaskmodelMapper;
import com.hwh.lifeupdate.service.TaskmodelService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @description:
 * @author: HWH
 * @create: 2022-10-28 15:53
 **/

@SpringBootTest
@Slf4j
public class TaskModelTest {

    @Resource
    TaskmodelService taskmodelService;

    @Test
    public void test(){
        log.info(taskmodelService.query().toString());
    }
}
