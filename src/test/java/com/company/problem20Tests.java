/* 
 * @author Oleh Dutko
 * https://projecteuler.net/problem=20
 */

package com.company;

import org.junit.Assert;
import org.junit.Test;

public final class problem20Tests {


    @Test
    public void checkResultCorrectNumber() {
        Assert.assertEquals(648, new problem20().getFactorialDiggitSum(100));
    }

    @Test
    public void checkResultZero() {
        Assert.assertEquals(1, new problem20().getFactorialDiggitSum(0));
    }

    @Test
    public void checkResultNegativeNumber() {
        Assert.assertEquals(1, new problem20().getFactorialDiggitSum(-1));
    }

}
