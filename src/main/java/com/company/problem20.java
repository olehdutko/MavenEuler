/* 
 * @author Oleh Dutko
 * https://projecteuler.net/problem=20
 */

package com.company;

import java.math.BigInteger;

public final class problem20 {

    private final static int NUMBER = 100;

    public static void main(String[] args) {
        System.out.println(new problem20().getFactorialDiggitSum(NUMBER));
    }

    public static int getFactorialDiggitSum(int number) {
        long start = System.currentTimeMillis();
        int sum = 0;
        System.out.println(number + "! = " + factorial(number));
        String numberStr = factorial(number).toString();
        //getting length of number (it is string now)
        int numberStrLength = numberStr.length();

        for (int i = 0; i < numberStrLength; i++)
            //adding each position in ASCII to 'sum'
            sum += numberStr.charAt(i) - '0';
        System.out.println("Sum of all digits in " + number + "! = " + sum);
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Code execution time " + time + " milisesonds");
        return sum;

    }


    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        //getting factorial from number
        for (int i = 1; i <= n; ++i) result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

}
