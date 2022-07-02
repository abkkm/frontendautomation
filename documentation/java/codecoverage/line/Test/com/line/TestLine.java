package com.line;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestLine {
    @Test
    public void expectLengthAs5ForLineWithTwoPoints () {
        Point pointWithCoordinate1And4 = new Point(1.0f, 4.0f);
        Point pointWithCoordinate5And7 = new Point(5.0f,7.0f);
        Line lineWithTwoPoints = new Line(pointWithCoordinate1And4, pointWithCoordinate5And7);
        assertEquals((float)5.0,lineWithTwoPoints.computeLength());
    }

    @Test
    public void linesWithSameStartPointAndSameEndPointAreEqual() {
        Point pointWithCoordinat2And4 = new Point(2, 4);
        Point pointWithCoordinat1And6 = new Point(1, 6);
        Line lineOne = new Line(pointWithCoordinat2And4, pointWithCoordinat1And6);
        Line lineTwo = new Line(pointWithCoordinat2And4, pointWithCoordinat1And6);
        assertEquals(true, Line.isSame(lineOne, lineTwo));
    }
}
