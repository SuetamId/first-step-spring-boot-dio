package com.dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired
    private Calc calc;
    @Override
    public void run(String... args) throws Exception {
        int number1 = 1;
        int number2 = 2;
        System.out.println("The result is" + calc.sum(number1,number2));
    }
}
