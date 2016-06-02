package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Irina on 02.06.2016.
 */
public class PointTests {

    @Test
    public void testDist() {
        Point p1 = new Point(2, 8);
        Point p2 = new Point(1, 12);

        Point p3 = new Point(21, 7);
        Point p4 = new Point(27, 1);

        Assert.assertEquals(p1.dist(p2), 4.0);
        Assert.assertEquals(p3.dist(p4), 8.0);
        Assert.assertNotNull(p3.dist(p4));
        Assert.assertTrue(p3.dist(p4) >= p1.dist(p2));
        Assert.assertTrue(p4.dist(p1) >= p2.dist(p3));
    }




}
