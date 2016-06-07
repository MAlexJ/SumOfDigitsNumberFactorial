package com.malex.util;

import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

/**
 * Created by malex on 07.06.16.
 */
public class FactorialTest {

    private BigInteger[] expectNumbers;

    /**
     * Table of Factorials -> http://2000clicks.com/mathhelp/BasicFactorialTable.aspx
     */
    @Before
    public void init() {
        expectNumbers = new BigInteger[]{
                BigInteger.valueOf(1),
                BigInteger.valueOf(1),
                BigInteger.valueOf(2),
                BigInteger.valueOf(6),
                BigInteger.valueOf(24),
                BigInteger.valueOf(120),
                BigInteger.valueOf(720),
                BigInteger.valueOf(5040),
                BigInteger.valueOf(40320),
                BigInteger.valueOf(362880),
                BigInteger.valueOf(3628800),
                BigInteger.valueOf(39916800),
                BigInteger.valueOf(479001600),
                BigInteger.valueOf(6227020800L),
                BigInteger.valueOf(87178291200L),
                BigInteger.valueOf(1307674368000L),
                BigInteger.valueOf(20922789888000L),
        };
    }

    @Test
    public void getFactorialNumberTest() {
        //given
        Factorial factorial = new Factorial();
        BigInteger expectNumber = expectNumbers[expectNumbers.length - 1];

        //when
        BigInteger actualNumber = factorial.getFactorialNumber(expectNumbers.length - 1);

        //then
        assertNotNull(actualNumber);
        assertEquals(expectNumber, actualNumber);
    }

    @Test
    public void getFactorialNumberOneTest() {
        //given
        Factorial factorial = new Factorial();
        BigInteger expectNumber = expectNumbers[1];

        //when
        BigInteger actualNumber = factorial.getFactorialNumber(1);

        //then
        assertNotNull(actualNumber);
        assertEquals(expectNumber, actualNumber);
    }

    @Test
    public void getFactorialNumbersTest() {
        //given
        Factorial factorial = new Factorial();

        //when
        for (int i = 0; i < expectNumbers.length; i++) {
            BigInteger actualNumber = factorial.getFactorialNumber(i);
            assertNotNull(actualNumber);
            assertEquals(expectNumbers[i], actualNumber);
        }
    }


    /**
     * In mathematics, the factorial of a non-negative integer n, denoted by n!,
     * is the product of all positive integers less than or equal to n.
     */
    @Test(expected = IllegalArgumentException.class)
    public void getFactorialNumberInCorrectNumberTest() {
        //given
        Factorial factorial = new Factorial();

        //when
        factorial.getFactorialNumber(-2);
    }

    /**
     * In mathematics, the factorial of a non-negative integer n, denoted by n!,
     * is the product of all positive integers less than or equal to n.
     * n = (n+1)! / n! =>
     * 1! / 0! = 1 =>
     * 0! = 1
     */
    @Test
    public void getFactorialNumberNullNumberTest() {
        //given
        Factorial factorial = new Factorial();
        BigInteger expectNumber = BigInteger.valueOf(1);

        //when
        BigInteger actualNumber = factorial.getFactorialNumber(0);

        //then
        assertNotNull(actualNumber);
        assertEquals(expectNumber, actualNumber);
    }

}
