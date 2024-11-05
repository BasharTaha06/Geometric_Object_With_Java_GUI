package com.mycompany.geometric_object_0;

public class Rectangle {

    private double width;
    private double height;
    private String color;
    private boolean filled;
    

    public Rectangle() {
    
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
       }

    public Rectangle(double width, double height, String color, boolean filled) {
        this(width, height);
        this.color = color;
        this.filled = filled;
    }

    public void SetWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
            return width;
       
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {  
        return height;
        }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public double getArea() {
    return width*height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

}
