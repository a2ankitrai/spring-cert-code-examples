package com.spring.professional.exam.tutorial.module01.question29.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class SpringBean3 {

    @Value("test value")
    private String val;

    @Value("test value2")
    private String val2;

    public String getVal2() {
        return val2;
    }

    // If setVal2 is called with null argument, then the
    // @Value annotation will be ignored and method parameter will
    // have the null value.
    public void setVal2(@Value("test value2") String val2) {
        this.val2 = val2;
    }

    public SpringBean3(String val) {
        this.val = val;
    }

    public String getVal(){
        return this.val;
    }


}
