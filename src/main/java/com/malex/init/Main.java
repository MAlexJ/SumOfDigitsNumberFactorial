package com.malex.init;

import com.malex.service.FactorialService;
import com.malex.service.impl.FactorialServiceImpl;

/**
 * Created by malex on 07.06.16.
 *
 * Task N3
 * Find sum of the digits in the number 100! (i.e. 100 factorial)
 * {Correct answer: 648}
 */
public class Main {
    public static void main(String[] args) {
        int number = 100;
        FactorialService factorialService = new FactorialServiceImpl();
        System.out.println("The sum of the digits in the number 100! -> " + factorialService.getSumFactorialNumbers(number));
    }
}
