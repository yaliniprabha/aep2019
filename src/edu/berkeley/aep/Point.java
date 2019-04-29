package edu.berkeley.aep;

import java.util.HashMap;
import java.util.Map;

// Understands a position on a numerical plane
public class Point {

    private final int xPosition;
    private final int yPosition;
   
     
    public Point(int xpos) {
        this.xPosition = xpos;
        this.yPosition = 0;
    }
    
    public Point(int xpos, int ypos) {
        this.xPosition = xpos;
        this.yPosition = ypos;
    }

    public int calc_dist(Point other) {
        return Math.abs(this.xPosition - other.xPosition);
    }
    
    public double calc_euc_dist(Point other) {
        return Math.sqrt(Math.pow((this.xPosition - other.xPosition), 2) + Math.pow((this.yPosition - other.yPosition), 2));
        
    }
    
     public double calc_mink_dist(Point other, int p) {
         if (p == 2) {
             return this.calc_euc_dist(other);
         }
         return Math.pow(Math.pow((this.xPosition - other.xPosition), p) + Math.pow((this.yPosition - other.yPosition), p), 1/3);
        
    }
    
    public int calc_manh_dist(Point other) {
        return Math.abs(this.xPosition - other.xPosition) + Math.abs(this.yPosition - other.yPosition);
    }
    
    public double calc_cos_sim(Point other) {
        double dotProduct = (this.xPosition * other.xPosition) + (this.yPosition * other.yPosition);
        double normA = Math.pow(this.xPosition, 2) + Math.pow(this.yPosition, 2);
        double normB = Math.pow(other.xPosition, 2) + Math.pow(other.yPosition, 2);
        return dotProduct / (Math.sqrt(normA) * Math.sqrt(normB));
    }
}
