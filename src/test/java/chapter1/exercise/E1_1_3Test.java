package chapter1.exercise;

import org.junit.Assert;
import org.junit.Test;

public class E1_1_3Test {
    @Test
    public void tripleEqual() {
        Assert.assertEquals(false, E1_1_3.tripleEqual(new String[] {}));
        Assert.assertEquals(false, E1_1_3.tripleEqual(new String[] { "1" }));
        Assert.assertEquals(false, E1_1_3.tripleEqual(new String[] { "1", "2" }));
        Assert.assertEquals(false, E1_1_3.tripleEqual(new String[] { "1", "2", "3" }));
        Assert.assertEquals(false, E1_1_3.tripleEqual(new String[] { "1", "1", "1.0" }));
        Assert.assertEquals(true, E1_1_3.tripleEqual(new String[] { "1", "1", "1" }));
        Assert.assertEquals(false, E1_1_3.tripleEqual(new String[] { "1", "1", "1", "1" }));
    }
}
