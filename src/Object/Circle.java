/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import Validation.Validation;

/**
 *
 * @author admin
 */
public class Circle extends Shape{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getPerimeter() {
       return Math.PI * 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printResult() {
        System.out.println("-----Circle-----");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " +  getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
    
    public void inputCircle() {
        Validation v = new Validation();
        double r = v.getDouble("Please input radius of Circle: ", 1, Double.MAX_VALUE);
        setRadius(r);
    }
}
