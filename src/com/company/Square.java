package com.company;

public class Square extends Figure {
    private int side;

    public Square(String name, int side) {
        super(name);
        this.side = side;
    }

    public Square(String name) {
        super(name);
    }

    @Override
    public int calculatePerimeter() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("◼");
    }
}
