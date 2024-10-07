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
public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void printResult() {
        System.out.println("-----Triangle-----");
        System.out.println("Side A: " + a);
        System.out.println("Side B: " + b);
        System.out.println("Side C: " + c);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
    
    public void inputTriangle() {
        Validation v = new Validation();
        boolean flag = true;
        while(true){
            double sideA = v.getDouble("Please input side A of Triangle: ", 1, Double.MAX_VALUE);
            double sideB = v.getDouble("Please input side B of Triangle: ", 1, Double.MAX_VALUE);
            double sideC = v.getDouble("Please input side C of Triangle: ", 1, Double.MAX_VALUE);
            if(a + b > c && b + c > a && a + c > b){
                setA(sideA);
                setB(sideB);
                setC(sideC);
                break;
            } else{
                System.err.println("The sides do not form a valid triangle. Please input again.");
            }
        }
    }
}
