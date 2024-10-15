package nl.desop7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to choose between creating a Rectangle or a Circle
        System.out.println("Welcome! Please choose a shape to create:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        int choice = scanner.nextInt();

        // Depending on the user's choice, create a Rectangle or Circle
        if (choice == 1) {
            // User selected Rectangle
            System.out.println("You selected Rectangle. Would you like to:");
            System.out.println("1. Use default dimensions (4 Length, 2 Width)");
            System.out.println("2. Provide one dimension (used for both length and width)");
            System.out.println("3. Provide two dimensions (length and width)");
            int rectangleChoice = scanner.nextInt();

            Rectangle rectangle;

            // Handle different choices for creating a Rectangle
            switch (rectangleChoice) {
                case 1:
                    // Create Rectangle with default values
                    rectangle = new Rectangle();
                    break;
                case 2:
                    // Prompt for one dimension, which will be used for both length and width
                    System.out.print("Enter the size for both length and width: ");
                    int size = scanner.nextInt();
                    rectangle = new Rectangle(size);
                    break;
                case 3:
                    // Prompt for length and width
                    System.out.print("Enter the length: ");
                    int length = scanner.nextInt();
                    System.out.print("Enter the width: ");
                    int width = scanner.nextInt();
                    rectangle = new Rectangle(length, width);
                    break;
                default:
                    System.out.println("Invalid choice! Default Rectangle will be created.");
                    rectangle = new Rectangle();
            }

            // Output the area and perimeter of the rectangle
            System.out.println("Rectangle Area: " + rectangle.calculateArea());
            System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

            // Prompt user for input regarding pole placement
            System.out.print("Enter the distance between poles (in meters): ");
            int distanceBetweenPoles = scanner.nextInt();
            System.out.println("Number of poles needed: " + rectangle.calculatePoles(distanceBetweenPoles));

            // Optionally, user can also calculate how many times another rectangle fits
            System.out.print("Do you want to calculate how another rectangle fits? (yes = 1 / no = 0): ");
            int fitChoice = scanner.nextInt();
            if (fitChoice == 1) {
                // Get dimensions of the second rectangle
                System.out.print("Enter the width of the second rectangle: ");
                int otherWidth = scanner.nextInt();
                System.out.print("Enter the length of the second rectangle: ");
                int otherLength = scanner.nextInt();
                Rectangle otherRectangle = new Rectangle(otherLength, otherWidth);
                System.out.println("The second rectangle fits " + rectangle.fitsIn(otherRectangle) + " times.");
            }

            // Demonstrate overloaded area and perimeter methods
            System.out.print("Do you want to calculate area or perimeter with custom dimensions? (yes = 1 / no = 0): ");
            int customCalcChoice = scanner.nextInt();
            if (customCalcChoice == 1) {
                System.out.print("Enter the custom length: ");
                double customLength = scanner.nextDouble();
                System.out.print("Enter the custom width: ");
                double customWidth = scanner.nextDouble();
                System.out.println("Custom Rectangle Area: " + rectangle.calculateArea(customLength, customWidth));
                System.out.println("Custom Rectangle Perimeter: " + rectangle.calculatePerimeter(customLength, customWidth));
            }

        } else if (choice == 2) {
            // User selected Circle
            System.out.println("You selected Circle. Would you like to:");
            System.out.println("1. Use default radius (8)");
            System.out.println("2. Provide a custom radius");
            int circleChoice = scanner.nextInt();

            Circle circle;

            // Handle different choices for creating a Circle
            if (circleChoice == 1) {
                // Create Circle with default radius
                circle = new Circle();
            } else {
                // Prompt for a custom radius
                System.out.print("Enter the radius: ");
                double radius = scanner.nextDouble();
                circle = new Circle(radius);
            }

            // Output the diameter, area, and perimeter of the circle
            System.out.println("Circle Diameter: " + circle.calculateDiameter());
            System.out.println("Circle Area: " + circle.calculateArea());
            System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

            // Prompt user for input regarding pole placement
            System.out.print("Enter the distance between poles (in meters): ");
            int distanceBetweenPoles = scanner.nextInt();
            System.out.println("Number of poles needed: " + circle.calculatePoles(distanceBetweenPoles));

            // Optional: Using overloaded methods for demonstration
            System.out.print("Do you want to calculate area or perimeter with a custom radius? (yes = 1 / no = 0): ");
            int customCircleCalcChoice = scanner.nextInt();
            if (customCircleCalcChoice == 1) {
                System.out.print("Enter the custom radius for calculations: ");
                double customRadius = scanner.nextDouble();
                System.out.println("Custom Circle Area: " + circle.calculateArea(customRadius));
                System.out.println("Custom Circle Perimeter: " + circle.calculatePerimeter(customRadius));
            }

            // Demonstrate setting the radius from diameter
            System.out.print("Do you want to set radius from diameter? (yes = 1 / no = 0): ");
            int setRadiusChoice = scanner.nextInt();
            if (setRadiusChoice == 1) {
                System.out.print("Enter the diameter: ");
                double diameter = scanner.nextDouble();
                circle.setRadiusFromDiameter(diameter);
                System.out.println("Updated Circle Diameter: " + circle.calculateDiameter());
                System.out.println("Updated Circle Area: " + circle.calculateArea());
                System.out.println("Updated Circle Perimeter: " + circle.calculatePerimeter());
            }

        } else {
            System.out.println("Invalid choice! Please select either 1 or 2.");
        }

        // Close the scanner
        scanner.close();
    }
}
