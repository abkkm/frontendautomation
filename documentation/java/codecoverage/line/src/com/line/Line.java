package com.line;

public class Line {


    private final Point startPoint;
    private final Point endPoint;

    public Line(Point pointOne, Point pointTwo) {
            this.startPoint = pointOne;
            this.endPoint = pointTwo;
    }

    public float computeLength() {

        return Point.computeDistance(startPoint, endPoint);
    }

    public static boolean isSame(Line lineOne, Line lineTwo) {
            return (lineOne.startPoint.equals(lineTwo.startPoint) && lineOne.endPoint.equals(lineTwo.endPoint));
    }
}
