package com.thanh;

import com.thanh.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArg0RunsWell();
        testFactorialGivenRightArg5RunsWell();
        testFactorialGivenRightArg6RunsWell();
        testFactorialGivenWrongArgMinus5ThrowsException();
    }
    //test case #1: check/Verify getaFactorial() method with valid parameter, e.g n = 0
    //steps/procedure:
    //  1. Given a valid n, e.g. n=0
    //  2. call/invoke getFactorial(n=0)
    //  3.execute
    //expected result:
    //  the method will return 1 as the result of 0!
    //status
    //passed or failed ?
    public static void testFactorialGivenRightArg0RunsWell() {
        int n = 0; // đầu vào
        long expectedValue =1; //hope to see 0!=1, kì vọng thôi
        long actualValue = MathUtility.getFactorial(n);
        //test nè, so sánh actual vs. expected
        //dùng biến boolean hoặc in ra
        System.out.println("0! expected: "+expectedValue);
        System.out.println("0! actual: "+actualValue);
    }
    //test case #2: check/Verify getaFactorial() method with valid parameter, e.g n = 5
    //steps/procedure:
    //  1. Given a valid n, e.g. n=5
    //  2. call/invoke getFactorial(n=5)
    //  3.execute
    //expected result:
    //  the method will return 1 as the result of 5!
    //status
    //passed or failed ?
    public static void testFactorialGivenRightArg5RunsWell() {
        int n = 5; // đầu vào
        long expectedValue =1; //hope to see 5!=120, kì vọng thôi
        long actualValue = MathUtility.getFactorial(n);
        //test nè, so sánh actual vs. expected
        //dùng biến boolean hoặc in ra
        System.out.println("5! expected: "+expectedValue);
        System.out.println("5! actual: "+actualValue);
    }

    //test case #2: check/Verify getaFactorial() method with valid parameter, e.g n = 6
    //steps/procedure:
    //  1. Given a valid n, e.g. n=6
    //  2. call/invoke getFactorial(n=6)
    //  3.execute
    //expected result:
    //  the method will return 1 as the result of 6!
    //status
    //passed or failed ?
    public static void testFactorialGivenRightArg6RunsWell() {
        System.out.println("6! expected =720 | actual ="+MathUtility.getFactorial(6));
    }

    //test case #3: check/Verify getaFactorial() method with invalid parameter, e.g n = -5
    //steps/procedure:
    //  1. Given a valid n, e.g. n=-5
    //  2. call/invoke getFactorial(n=-5)
    //  3.execute
    //expected result:
    //  the method will return 1 as the result of 6!
    //status
    //passed or failed ?

    public static void testFactorialGivenWrongArgMinus5ThrowsException() {
        MathUtility.getFactorial(-5);//passe vì kì vọng ngoại lệ xuất hiện

    }
}