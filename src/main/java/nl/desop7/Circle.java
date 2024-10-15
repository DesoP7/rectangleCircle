package nl.desop7;

public class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(8); // Default radius is 8
    }

    // Single parameter constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Calculate diameter
    public double calculateDiameter() {
        return 2 * radius;
    }

    // Calculate perimeter (circumference)
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate poles based on perimeter and distance between poles
    public double calculatePoles(int distanceBetweenPoles) {
        return this.calculatePerimeter() / (double) distanceBetweenPoles;
    }

    // Method to set radius from diameter
    public void setRadiusFromDiameter(double diameter) {
        this.radius = diameter / 2; // Set radius from the diameter
    }

    // Overloaded method to calculate area with a custom radius
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Overloaded method to calculate perimeter with a custom radius
    public double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}
