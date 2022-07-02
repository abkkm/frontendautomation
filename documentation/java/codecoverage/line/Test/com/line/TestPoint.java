package com.line;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPoint {
    @Test
    public void expectDistace5BetweenPointWithCoordinate1And4AndpointWithCoordinate5And7() {
        Point pointWithCoordinate1And4 = new Point(1.0f, 4.0f);
        Point pointWithCoordinate5And7 = new Point(5.0f,7.0f);
        assertEquals((float)5.0,Point.computeDistance(pointWithCoordinate1And4, pointWithCoordinate5And7));
    }
}
