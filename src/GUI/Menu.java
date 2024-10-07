package GUI;

import Object.Circle;
import Object.Rectangle;
import Object.Triangle;

public class Menu {
    Triangle triangle = new Triangle();
    Rectangle rectangle = new Rectangle();
    Circle circle = new Circle();
    
    void input(){
        System.out.println("=====Calculator Shape Program=====");
        rectangle.inputRectangle();
        circle.inputCircle();
        triangle.inputTriangle();
    }
    
    void display() {     
        rectangle.printResult();
        circle.printResult();
        triangle.printResult();
    }
    
}
