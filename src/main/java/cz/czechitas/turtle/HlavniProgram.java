package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        drawIcecream();

        zofka.penUp();
        zofka.move(250);
        zofka.turnLeft(90);

        zofka.penDown();
        drawSnowman();

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(450);
        zofka.turnRight(90);

        zofka.penDown();
        drawEngine();
    }

    public void drawTriangle(double side) {
        for (int i = 0; i < 3; i++) {
            zofka.move(side);
            zofka.turnRight(120);
        }
    }

    public void drawSquare(double side) {
        for (int i = 0; i < 4; i++) {
            zofka.move(side);
            zofka.turnRight(90);
        }
    }

    public void drawRectangle(double sideA, double sideB) {
        for (int i = 0; i < 2; i++) {
            zofka.move(sideA);
            zofka.turnRight(90);
            zofka.move(sideB);
            zofka.turnRight(90);
        }
    }

    public void drawCircle(double diameter) {
        for (int i = 0; i < 36; i++) {
            zofka.move(diameter * Math.sin(Math.toRadians(5))); //source: https://www.vypocitejto.cz/obsah-obvod/mnohouhelnik/
            zofka.turnRight(10);
        }
    }

    public void drawIcecream()
    {
        zofka.setPenColor(new Color(208, 86, 206));
        drawCircle(100);
        zofka.turnRight(90);

        zofka.setPenColor(new Color(217, 191, 180));
        drawTriangle(100);
    }
    public void drawSnowman() {
        zofka.penUp();
        zofka.move(200);
        zofka.turnRight(90);
        zofka.setPenColor(new Color(86, 171, 208));

        zofka.penDown();
        drawCircle(100);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnLeft(90);

        zofka.penDown();
        drawCircle(150);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(75);
        zofka.turnRight(90);
        zofka.move(75);
        zofka.turnLeft(90);

        zofka.penDown();
        drawCircle(50);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(155);
        zofka.turnLeft(90);

        zofka.penDown();
        drawCircle(50);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(75);
        zofka.turnLeft(90);
        zofka.move(75);
        zofka.turnLeft(90);

        zofka.penDown();
        drawCircle(220);
    }


    public void drawEngine() {
        zofka.setPenColor(new Color(52, 125, 20));
        drawRectangle(180, 100);
        zofka.turnLeft(90);
        drawRectangle(160, 80);
        zofka.turnRight(90);
        zofka.setPenColor(new Color(59, 59, 59));
        drawCircle(100);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(15);

        zofka.penDown();
        drawCircle(30);

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(15);
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(15);

        zofka.penDown();
        drawCircle(30);

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(15);
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(180);
        zofka.setPenColor(new Color(196, 34, 6));

        zofka.penDown();
        drawTriangle(120);

    }
}
