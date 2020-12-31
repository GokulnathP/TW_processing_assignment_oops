package com.gokulnathp;

import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class MainProcessing extends PApplet {
    public static final int WIDTH = 620;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 50;
    public static final int PARTITION_SIZE = 5;

    public final List<Ball> balls = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main(MainProcessing.class, args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for (int ballNumber = 1; ballNumber <= 4 ; ballNumber++) {
            Ball ball = buildBall(ballNumber);
            balls.add(ball);
        }
    }

    private Ball buildBall(int ballNumber) {
        int initialXAxisPosition = 0;
        int initialYAxisPosition = (ballNumber * HEIGHT) / PARTITION_SIZE;
        Ball ball = new Ball(ballNumber, initialXAxisPosition, initialYAxisPosition, DIAMETER);
        return ball;
    }

    @Override
    public void draw() {
        for (Ball ball : balls) {
            drawBall(ball);
        }
    }

    private void drawBall(Ball ball) {
        ellipse(ball.getxPosition(), ball.getyPosition(), ball.getDIAMETER(), ball.getDIAMETER());
        ball.setxPosition();
    }
}
