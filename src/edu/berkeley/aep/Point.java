package edu.berkeley.aep;

import java.util.HashMap;
import java.util.Map;

// Understands a position on a numerical plane
public class Point {

    private final int position;
     
    public Point(int pos) {
        this.position = pos;
    }

    public int calc_dist(Point other) {
        return Math.abs(this.position - other.position);
    }
}
