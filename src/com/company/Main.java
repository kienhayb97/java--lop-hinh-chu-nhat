package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());

        System.out.println("Enter the a: ");
        double a=scanner.nextDouble();
        System.out.println("Enter the b: ");
        double b=scanner.nextDouble();
        System.out.println("Enter the c: ");
        double c=scanner.nextDouble();
        Triangle triangle = new Triangle();
        triangle.setA(a);
        triangle.setB(b);
        triangle.setC(c);
        System.out.println("Triangle "+a+" "+b+" "+c+" is: "+triangle.getPerimeter());

    }

}
