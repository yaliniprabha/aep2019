package edu.berkeley.aep;

import java.util.HashMap;
import java.util.Map;

// Understands a four-sided figure with four right angles
public class Rectangle {

     private final int quantity;
    private final int width;

    public static Rectangle createSquare(int side) {
        return new Rectangle(side, side);
    }

    public Rectangle(int quantity, int width) {

        this.quantity = quantity;
        this.width = width;
    }

    public int calc_area() {
        return quantity * width;
    }
}
