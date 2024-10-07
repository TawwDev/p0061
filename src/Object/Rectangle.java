/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import Validation.Validation;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
    
    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void printResult() {
        System.out.println("-----Rectangle-----");
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
    
    public void inputRectangle() {
        Validation v = new Validation();
        while(true){
            double w = v.getDouble("Please input side width of Rectangle: ", 1, Double.MAX_VALUE);
            double l = v.getDouble("Please input side width of Rectangle: ", 1, Double.MAX_VALUE);
            if(l > w){
                setWidth(width);
                setLength(length);
                break;
            } else{
                System.out.println("re-input");
            }
        }
    }
    
    
}
