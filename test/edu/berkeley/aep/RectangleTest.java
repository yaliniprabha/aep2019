package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void rectangleWithSideOneShouldHaveAreaOne() {
        var rectangle = new Rectangle(1, 1);
        assertEquals(1, rectangle.calc_area());
    }

    @Test
    public void rectangleWithSideTwoShouldHaveAreaFour() {
        var rectangle = new Rectangle(2, 2);
        assertEquals(4, rectangle.calc_area());
    }
}
