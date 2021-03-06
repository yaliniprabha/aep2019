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
    public void eucDistanceBetweenPointAtFourThreeAndThreeOneShouldBeRootOfFive() {
        var pointA = new Point(4, 3);
        var pointB = new Point(3, 1);
        assertEquals(Math.sqrt(5), pointA.calc_euc_dist(pointB), 0.1);
    }
    
    @Test
    public void manhDistanceBetweenPointAtFourTwoAndItselfShouldBeZero() {
        var pointA = new Point(4, 2);
        assertEquals(0, pointA.calc_manh_dist(pointA));
    }
    
    @Test
    public void manhDistanceBetweenPointAtSixNegThreeAndFourTwoShouldBeSeven() {
        var pointA = new Point(6, -3);
        var pointB = new Point(4, 2);
        assertEquals(7, pointA.calc_manh_dist(pointB));
    }
    
    @Test
    public void minkDistanceBetweenPointAtFourThreeAndThreeOneShouldBeZero() {
        var pointA = new Point(4, 3);
        var pointB = new Point(3, 1);
        assertEquals(Math.cbrt(9), pointA.calc_mink_dist(pointB, 3), 0.1);
    }
    
     @Test
    public void cosSimilarityBetweenPointAtFourTwoAndItselfShouldBeOne() {
        var pointA = new Point(4, 2);
        assertEquals(1.0, pointA.calc_cos_sim(pointA), 0.01);
    }
    
     @Test
    public void cosSimilarityBetweenPointAtFourTwoAndEightThreeShouldBePointNineNine() {
        var pointA = new Point(4, 2);
        var pointB = new Point(8, 3);
        assertEquals(0.994, pointA.calc_cos_sim(pointB), 0.01);
    }
    
}
