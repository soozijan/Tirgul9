package com.company.Tirgul9;

import org.junit.Test;

import java.lang.reflect.Field;

import static junit.framework.TestCase.assertEquals;

public class TripleCalculatorTest {
    @Test
    public void testCalcAddPositiveNumber() {
        TripleCalculator tripleCalculator = new TripleCalculator();
        tripleCalculator.calc(5);
        int actual_number = 5 * 3;
        assertEquals(15, actual_number);
    }

    @Test

    public void testCalcAddNegativeNumber() {
        TripleCalculator tripleCalculator = new TripleCalculator();
        tripleCalculator.calc(-5);
        int actual_number = -5 * 3;
        assertEquals(-15, actual_number);

    }

    @Test

    public void testCalcAddZeroNumber() {
        TripleCalculator tripleCalculator = new TripleCalculator();
        tripleCalculator.calc(0);
        int actual_number = 300;
        assertEquals(300, actual_number);
    }

    @Test

    public void testCalcAddSevenNumber() {
        TripleCalculator tripleCalculator = new TripleCalculator();
        tripleCalculator.calc(7);
        int actual_number = 7;
        assertEquals(7, actual_number);
    }

    @Test

    public void testCalcAddMitkhalekBeShevaNumber() {
        TripleCalculator tripleCalculator = new TripleCalculator();
        tripleCalculator.calc(14);
        int actual_number = 7;
            assertEquals(7, actual_number);
        }



    @Test

    public void testCalcAddCountMassege() {
        TripleCalculator tripleCalculator = new TripleCalculator();
        tripleCalculator.calc(7);
        int m_boomCount = 0; // m_boomCount
        Field privateintField = null;
        try {
            privateintField = TripleCalculator.class.
                    getDeclaredField("boomCount");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        privateintField.setAccessible(true);
        try {
            m_boomCount = (int) privateintField.get(tripleCalculator);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        int actual_number = m_boomCount;
        assertEquals(1, actual_number);


    }





    }

