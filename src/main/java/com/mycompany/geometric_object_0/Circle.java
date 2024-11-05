
package com.mycompany.geometric_object_0;

public class Circle  {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {

        this.radius = radius;
    }

    public void setRadius(double radius) {
            this.radius = radius;
        
    }

    public double getRadius() {
            return radius;
    }

    
    public double getArea() {
            return Math.PI * radius * radius;
    }

    public double getPerimeter() {
            return Math.PI * radius * 2;
    }

}
