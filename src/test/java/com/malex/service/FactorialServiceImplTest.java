package com.malex.service;

import com.malex.service.impl.FactorialServiceImpl;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by malex on 07.06.16.
 */
public class FactorialServiceImplTest {

    private FactorialService service;

    /**
     * Sum of the digits in the number 100!
     * {Correct answer: 648}
     */
    @Test
    public void getSumFactorialNumberTest() {
        //given
        service = new FactorialServiceImpl();

        //when
        long sumFactorialNumbers = service.getSumFactorialNumbers(100);

        //then
        assertEquals(648, sumFactorialNumbers);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getSumFactorialInCorrectNumberTest() {
        //given
        service = new FactorialServiceImpl();

        //when
        service.getSumFactorialNumbers(-1);
    }

    @Test
    public void getSumFactorialNullNumberTest() {
        //given
        service = new FactorialServiceImpl();

        //when
        long sumFactorialNumbers = service.getSumFactorialNumbers(0);

        //then
        assertEquals(1, sumFactorialNumbers);
    }

    /**
     *   Sum of the digits in the number 6! -> 7+2+0=9 (6!=720)
     */
    @Test
    public void getSumFactorialNumberTest_01() {
        //given
        service = new FactorialServiceImpl();
        //7+2+0=9
        long expectNumber = 9L;

        //when
        long actualNumber = service.getSumFactorialNumbers(6);

        //then
        assertEquals(expectNumber, actualNumber);
    }

}
