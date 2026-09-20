package com.app.geometry;

public class Point2D {

    private double x;
    private double y;

    // Parameterized constructor
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Return point details
    public String getDetails() {
        return "(" + x + ", " + y + ")";
    }

    // Check whether two points are equal
    public boolean isEqual(Point2D p) {

        if (this.x == p.x && this.y == p.y)
            return true;
        else
            return false;
    }

    // Calculate distance between two points
    public double calculateDistance(Point2D p) {

        double distance;

        distance = Math.sqrt(
                Math.pow(this.x - p.x, 2)
                + Math.pow(this.y - p.y, 2)
        );

        return distance;
    }
}