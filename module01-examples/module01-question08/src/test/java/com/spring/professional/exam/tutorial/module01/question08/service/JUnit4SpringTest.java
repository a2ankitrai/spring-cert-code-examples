package com.spring.professional.exam.tutorial.module01.question08.service;

import com.spring.professional.exam.tutorial.module01.question08.ApplicationConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
public class JUnit4SpringTest {

    @Autowired
    protected ApplicationContext applicationContext;

    @Test
    public void contextLoads(){
        System.out.println("Application Context: " + applicationContext.getApplicationName());
    }
}
