package nl.desop7;

public class Rectangle {
    private final int length;
    private final int width;

    // Default constructor
    public Rectangle() {
        this(4, 2); // Call the two-parameter constructor with default values
    }

    // Single parameter constructor
    public Rectangle(int size) {
        this(size, size); // Call the two-parameter constructor with the same size for length and width
    }

    // Two-parameter constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Calculate area
    public int calculateArea() {
        return length * width;
    }

    // Calculate perimeter
    public int calculatePerimeter() {
        return 2 * (length + width);
    }

    // Overloaded method to calculate area with custom dimensions
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Overloaded method to calculate perimeter with custom dimensions
    public double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    // Method to calculate fit based on given width and length
    public int fitsIn(Rectangle other) {
        return this.calculateArea() / other.calculateArea();
    }

    // Method to calculate poles based on perimeter and distance between poles
    public double calculatePoles(int distanceBetweenPoles) {
        return this.calculatePerimeter() / (double) distanceBetweenPoles;
    }

}
