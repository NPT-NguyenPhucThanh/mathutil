package com.thanh.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    // CHUẨN bị bộ data để riêng, sau đó fill vào lệnh test
    // mảng 2 chiều , gồm giá trị kỳ vọng  | con n!
    public static Object[][] initTestData(){
        // tra ve mang 2 chieu
        Object testData[][] = {
                {0,1},
                {1,1},
                {2,2},
                {3,6},
                {4,240},
                {5,120},
                {6,720}
        };
        return testData;
    }

    //@test
    @ParameterizedTest
    @MethodSource("initTestData") // ten ham cung cap data
    public void testFactorialGivenRightArgRunsWell( int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }

}