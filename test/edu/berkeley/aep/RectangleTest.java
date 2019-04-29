package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {
    @Test
    public void oneDDistanceBetweenAPointAndItselfShouldBeZero() {
        var pointA = new Point(1);
        assertEquals(0, pointA.calc_dist(pointA));
    }
}
