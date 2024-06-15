package com.mycompany.rectangle; 
public class Rectangle { 
private final double length; 
private final double width; 
public Rectangle(double length, double width) { 
this.length = length; 
this.width = width; 
} 
public double calculatePerimeter() { 
return 2 * (length + width); 
} 
public double calculateArea() { 
return length * width; 
} 
public static void main(String[] args) { 
Rectangle rect1 = new Rectangle(5, 3); 
System.out.println("Perimeter of rectangle 1: " + rect1.calculatePerimeter());
    System.out.println("Area of rectangle 1: " + rect1.calculateArea());
  }
}