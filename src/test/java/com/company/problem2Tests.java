/* 
 * @author Oleh Dutko
 * https://projecteuler.net/problem=2
 */

package com.company;

import org.junit.Assert;
import org.junit.Test;

public final class problem2Tests {
    private static final int MAX_FIBONACCI = 4000000;

    @Test
    public void checkResult() {
        Assert.assertEquals(4613732, new problem2().getFibonacciSum(MAX_FIBONACCI));
    }

    @Test
    public void checkResultZeroMaxValue() {
        Assert.assertEquals(0, new problem2().getFibonacciSum(0));
    }

    @Test
    public void checkResultNegativeMaxValue() {
        Assert.assertEquals(0, new problem2().getFibonacciSum(-9990));
    }


}
