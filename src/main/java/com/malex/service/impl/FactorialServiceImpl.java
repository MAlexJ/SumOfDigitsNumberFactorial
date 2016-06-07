package com.malex.service.impl;

import com.malex.service.FactorialService;
import com.malex.util.Factorial;

import java.math.BigInteger;

/**
 * Created by malex on 07.06.16.
 */
public class FactorialServiceImpl implements FactorialService {

    private Factorial factorial = new Factorial();

    @Override
    public long getSumFactorialNumbers(int num) {
        BigInteger factorialNumber = factorial.getFactorialNumber(num);
        long sum = 0;
        while (factorialNumber.compareTo(BigInteger.ZERO) > 0) {
            sum += factorialNumber.mod(BigInteger.TEN).longValue();
            factorialNumber = factorialNumber.divide(BigInteger.TEN);
        }
        return sum;
    }
}
