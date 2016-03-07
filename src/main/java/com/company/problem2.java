/* 
 * @author Oleh Dutko
 * https://projecteuler.net/problem=2
 */

package com.company;


public final class problem2 {
    private static final int BIG_NUMBER = 1000;
    private static final int MAX_FIBONACCI = 4000000;

    public static void main(String[] args) {
        System.out.println(new problem2().getFibonacciSum(MAX_FIBONACCI));
    }


    public static int getFibonacciSum(int maxValue) {
        long start = System.currentTimeMillis();

        //default value
        int fibonacсiSum = 0;
        for (int i = 0; ; i++) {
            //get fibonacci number
            int fibonacciNumber = getFibonacciNumber(i);
            //checking value is less than max value. If it less or equal than break;
            if (fibonacciNumber >= maxValue)
                break;
            //checking value is odd or even
            if (fibonacciNumber % 2 == 0)
                //it fibonaci value is even than add it to fibonacсiSum
                fibonacсiSum += fibonacciNumber;
        }
        System.out.println("fibonacci Sum: " + fibonacсiSum);
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Code execution time " + time + " milisesonds");
        return fibonacсiSum;

    }


    private static int getFibonacciNumber(int value) {
        //checking margins
        if (value < 0 || value > BIG_NUMBER)
            throw new IllegalArgumentException();
        //set default  (first 2 fibonacci values)
        int firstN = 0;
        int secondN = 1;
        for (int i = 0; i < value; i++) {
            //getting sum (number should be sum of previous values)
            int summ = firstN + secondN;
            firstN = secondN;
            secondN = summ;
        }
        return firstN;
    }

}
