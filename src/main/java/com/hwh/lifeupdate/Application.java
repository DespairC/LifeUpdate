package com.hwh.lifeupdate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: HWH
 * @create: 2022-10-28 14:18
 **/


@SpringBootApplication
@MapperScan({"com.hwh.lifeupdate.mapper"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
