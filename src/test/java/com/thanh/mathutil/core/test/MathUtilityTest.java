package com.thanh.mathutil.core.test;

import com.thanh.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// imprort static chi danh cho static de giup ta lam bien go ten class chaams: le ra phai la MathUtility.getFactorial(2); thi nay chi can go getFactorial(5); la du
// gia su class co nhieu ham static thi ta doi qua dau * de goi het
class MathUtilityTest {
    @Test
    public void testFactorialGivenRightArg3RunsWell() {

        assertEquals(6, MathUtility.getFactorial(3));


    }
    @Test
    public void testFactorialGivenRightArg4RunsWell() {

        assertEquals(24, MathUtility.getFactorial(4));


    }
    @Test
    public void testFactorialGivenRightArg5RunsWell() {

        assertEquals(120, MathUtility.getFactorial(5));


    }
    @Test //@test la ghi chu bao hieu ham nay la ham main co the run
    // 1 class test co the co nhieu ham main()
    //test case #1: check/Verify getaFactorial() method with valid parameter, e.g n = 0
    //steps/procedure:
    //  1. Given a valid n, e.g. n=0
    //  2. call/invoke getFactorial(n=0)
    //  3.execute
    //expected result:
    //  the method will return 1 as the result of 0!
    //status
    //passed or failed ?
    public void testFactorialGivenRightArg0RunsWell() {
        int n = 0; // đầu vào
        long expectedValue =1; //hope to see 0!=1, kì vọng thôi
        long actualValue = MathUtility.getFactorial(n);
        //test nè, so sánh actual vs. expected
        //so sanh xem 0! co tra ve con so 1 hay ko
        assertEquals(expectedValue, actualValue);
        assertEquals(1, MathUtility.getFactorial(0));
        //expected                           vs actual    no se thay ra 2 mau: xanh va do


    }
}