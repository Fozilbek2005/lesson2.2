package com.company;

public class Rectangle extends Figure {
    private int sideaA, sideB;

    public Rectangle(String name, int sideaA, int sideB) {
        super(name);
        this.sideaA = sideaA;
        this.sideB = sideB;
    }

    @Override
    public int calculatePerimeter() {
        return (sideaA + sideB) * 2;
    }

    @Override
    public void draw() {
        System.out.println();
    }
}
