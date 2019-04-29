package edu.berkeley.aep;

import java.util.HashMap;
import java.util.Map;

// Understands a position on a numerical plane
public class Point {

    private final int xPosition;
    private final int yPosition;
   
     
    public Point(int xpos) {
        this.xPosition = xpos;
    }
    
    public Point(int xpos, int ypos) {
        this.xPosition = xpos;
        this.yPosition = ypos;
    }

    public int calc_dist(Point other) {
        return Math.abs(this.position - other.position);
    }
    
    public int calc_euc_dist(Point other) {
        return Math.sqrt(Math.pow((this.xPosition - other.xPosition), 2) + Math.pow((this.xPosition - other.xPosition), 2));
        
    }
}
