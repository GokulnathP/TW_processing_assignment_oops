package com.gokulnathp;

public class Ball {
    private final int speed;
    private int xPosition;
    private final int yPosition;
    private final int diameter;

    public Ball(int speed, int xPosition, int yPosition, int diameter) {
        this.speed = speed;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.diameter = diameter;
    }

    private void moveBall() {
        xPosition += speed;
    }

    public void draw(MainProcessing sketch) {
        sketch.ellipse(xPosition, yPosition, diameter, diameter);
        moveBall();
    }
}
