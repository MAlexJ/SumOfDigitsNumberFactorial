package com.malex.util;

import java.math.BigInteger;

/**
 * Created by malex on 07.06.16.
 */
public class Factorial {

    private BigInteger number;

    public BigInteger getFactorialNumber(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Please input correct number, num >0 !!!");
        } else {
            number = BigInteger.ONE;
            for (int i = 1; i <= num; i++) {
                number = number.multiply(BigInteger.valueOf(i));
            }
            return number;
        }
    }

}
