/**
    * A simple implementation of abstract classes, inheritance and polymorphism in Java.
 */

import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}

class Square extends Shape{
    Square(int w){
        width = w;
    }
    public void area(){
        int result = width*width;
        System.out.println("The area of your square is " + result);
    }
}

class Circle extends Shape{
    Circle(int w){
        width = w;
    }
    public void area(){
        double result = Math.PI*width*width;
        System.out.println("The area of your circle is " + result);
    }
}

public class Code{
public static void main(String [] args){

    System.out.println("Enter the width of your square: ");
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    System.out.println("Enter the radius of your circle: ");
    int y = scanner.nextInt();

    Square square = new Square(x);
    Circle circle = new Circle(y);

    square.area();
    circle.area();

}}