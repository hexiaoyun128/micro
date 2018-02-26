package com.hechihan.micro.apps.upms;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppUpmsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class AppUpmsApplicationTest {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
}