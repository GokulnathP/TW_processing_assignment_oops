package com.gokulnathp;

public class Ball {
    private final int ballNumber;
    private int xPosition;
    private final int yPosition;
    private final int diameter;

    public Ball(int ballNumber, int xPosition, int yPosition, int diameter) {
        this.ballNumber = ballNumber;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.diameter = diameter;
    }

    public void setxPosition() {
        xPosition += ballNumber;
    }

    public void draw(MainProcessing sketch) {
        sketch.ellipse(xPosition, yPosition, diameter, diameter);
        setxPosition();
    }
}
