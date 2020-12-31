package com.gokulnathp;

public class Ball {
    private final int ballNumber;
    private int xPosition;
    private final int yPosition;
    private final int DIAMETER;

    public Ball(int ballNumber, int xPosition, int yPosition, int DIAMETER) {
        this.ballNumber = ballNumber;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.DIAMETER = DIAMETER;
    }

    public int getBallNumber() {
        return ballNumber;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public int getDIAMETER() {
        return DIAMETER;
    }

    public void setxPosition() {
        xPosition += ballNumber;
    }

    public void draw() {

    }
}
