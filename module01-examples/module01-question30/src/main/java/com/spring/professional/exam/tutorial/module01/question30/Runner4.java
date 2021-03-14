package com.spring.professional.exam.tutorial.module01.question30;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;


public class Runner4 {
    public static void main(String[] args) {

        ExpressionParser parser = new SpelExpressionParser();

        Object value = parser
                .parseExpression("{1: 'a', 2: 'b', 3: 'c', 4: 'd'}.?[key % 2 == 0]")
                .getValue();
        System.out.println(value);

        System.out.println("----------");

        Object value2 = parser
                .parseExpression("{1: 'a', 2: 'b', 3: 'c', 4: 'd'}.!['Key: ' + key + ', Value: ' + value]")
                .getValue();
        System.out.println(value2);
    }
}
