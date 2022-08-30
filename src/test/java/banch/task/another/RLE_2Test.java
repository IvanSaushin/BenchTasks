package banch.task.another;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class RLE_2Test extends TestCase {

    @Test
    public void testRle() {
        String _1 = "d";
        String _2 = "dddacccd";
        String _3 = "aaabbc";
        String _4 = "aaabbbbcc";

        Assert.assertEquals("d", RLE_08_20.getRLE(_1));
        Assert.assertEquals("d3ac3d", RLE_08_20.getRLE(_2));
        Assert.assertEquals("a3b2c", RLE_08_20.getRLE(_3));
        Assert.assertEquals("a3b4c2", RLE_08_20.getRLE(_4));
    }
}
