package com.mycompany.geometric_object_0;

public class Square extends Rectangle {

    private double side;

    public Square() {
        
    }

    
    public Square(double side) {
        this.side = side;

    }

    public Square(double side, double width, double height, String color, boolean filled) {
        super(width, height, color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setside(double side) {
            this.side = side;
    }

    @Override
    public double getArea() {
            return side * side;
    }

    @Override
    public double getPerimeter() {
            return side * 4;
    }

}
