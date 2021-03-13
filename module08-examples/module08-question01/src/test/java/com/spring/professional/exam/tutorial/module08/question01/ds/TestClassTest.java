package com.spring.professional.exam.tutorial.module08.question01.ds;

import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

public class TestClassTest {

    @Test
    public void m1Test(){

        TestClass t1 = new TestClass();

        ReflectionTestUtils.setField(t1,"val","Ankit");
        ReflectionTestUtils.invokeMethod(t1, "m1");

    }
}
