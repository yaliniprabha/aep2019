package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {
    @Test
    public void oneDDistanceBetweenAPointAndItselfShouldBeZero() {
        var pointA = new Point(1);
        assertEquals(0, pointA.calc_dist(pointA));
    }
    
    @Test
    public void oneDDistanceBetweenPointAtFourAndPointAtTenShouldBeSix() {
        var pointA = new Point(4);
        var pointB = new Point(10);
        assertEquals(6, pointA.calc_dist(pointB));
    }
    
     @Test
    public void oneDDistanceBetweenPointAtFourAndPointAtNegativeFourShouldBeEight() {
        var pointA = new Point(4);
        var pointB = new Point(-4);
        assertEquals(8, pointA.calc_dist(pointB));
    }
    
    @Test
    public void eucDistanceBetweenPointAtFourTwoAndItselfShouldBeZero() {
        var pointA = new Point(4, 2);
        assertEquals(0.0, pointA.calc_euc_dist(pointA), 0.1);
    }
    
     @Test
    public void eucDistanceBetweenPointAtFourTwoAndItselfShouldBeZero() {
        var pointA = new Point(4, 2);
        assertEquals(0.0, pointA.calc_euc_dist(pointA), 0.1);
    }
    
     @Test
    public void eucDistanceBetweenPointAtFourThreeAndThreeOneShouldBeZero() {
        var pointA = new Point(4, 3);
        var pointB = new Point(3, 1);
        assertEquals(Math.sqrt(5), pointA.calc_euc_dist(pointA), 0.1);
    }
    
}
