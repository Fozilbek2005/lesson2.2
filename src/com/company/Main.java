package com.company;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle("круг", 13);
        Triangle triangle = new Triangle("треугольник", 4, 6, 2);
        Square square = new Square("квадрат", 15);
        Rectangle rectangle = new Rectangle("Прямоугольник - >", 10, 20);


        // System.out.println(circle.getName() + " периметер ->  " + circle.calculatePerimeter());
        //System.out.println(triangle.getName() + " периметер -> " + triangle.calculatePerimeter());
        //System.out.println(square.getName() + " периметер -> " + square.calculatePerimeter());
        //System.out.println(rectangle.getName() + " периметет -> " + rectangle.calculatePerimeter());


        Dog dog = new Dog("рекс");
        Cat cat = new Cat("багира");

        Drawable[] drawables = {circle, triangle, square, rectangle, dog, cat};

        for (Drawable drawable : drawables) {
            if (drawable instanceof Figure) {
                System.out.println(
                        ((Figure) drawable).getName() +
                                " периметер -> " + ((Figure) drawable).calculatePerimeter());
            }
            if (drawable instanceof Animal) {
                System.out.println(((Animal) drawable).getName());
            }
            drawable.draw();

        }


        Figure[] figures = {circle, triangle, square, rectangle};
        for (Figure figure : figures) {
            System.out.println(figure.getName() + " периметет -> " + figure.calculatePerimeter());

        }
        System.out.println("----------------------------------");
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].getName() + " переметер -> " + figures[i].calculatePerimeter());
        }

    }
}
