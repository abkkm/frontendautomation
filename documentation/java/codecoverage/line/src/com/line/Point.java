package com.line;

public class Point {
    private final float coordinate_X;
    private final float coordinate_Y;

    public Point(float coordinate_X, float coordinate_Y) {
        this.coordinate_X = coordinate_X;
        this.coordinate_Y = coordinate_Y;
    }

    public static float computeDistance(Point pointOne, Point pointTwo) {
        float  delX = pointOne.coordinate_X - pointTwo.coordinate_X;
        float delY = pointOne.coordinate_Y - pointTwo.coordinate_Y;
        return (float) Math.sqrt((delX * delX) + (delY * delY));
    }
}
