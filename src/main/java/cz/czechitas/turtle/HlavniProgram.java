package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        //TODO Tady bude kód pro kreslení želví grafiky.
        zofka.setPenColor(new Color(208, 86, 206));
        drawCircle(100);
        zofka.turnRight(90);
        zofka.setPenColor(new Color(217, 191, 180));
        drawTriangle(100);
    }

    public void drawTriangle(double side) {
        for(int i = 0; i < 3; i++)
        {
            zofka.move(side);
            zofka.turnRight(120);}
    }
    public void drawSquare(double side) {
        for(int i = 0; i < 4; i++)
        {
            zofka.move(side);
            zofka.turnRight(90);}
    }
    public void drawRectangle(double sideA, double sideB) {
        for(int i = 0; i < 2; i++)
        {
            zofka.move(sideA);
            zofka.turnRight(90);
            zofka.move(sideB);
            zofka.turnRight(90);}
    }

    public void drawCircle(double diameter) {
        for(int i = 0; i < 36; i++)

        {
            zofka.move(diameter*Math.sin(Math.toRadians(5))); //source: https://www.vypocitejto.cz/obsah-obvod/mnohouhelnik/
            zofka.turnRight(10);}
    }

}
