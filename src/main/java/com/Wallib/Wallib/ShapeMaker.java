package com.Wallib.Wallib;

public class ShapeMaker {

    private  Circle circle;
    private  Rectangle rectangle;
    private  Square square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRenctangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

}
