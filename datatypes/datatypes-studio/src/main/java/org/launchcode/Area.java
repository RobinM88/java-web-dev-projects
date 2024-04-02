package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = 0;

        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.print("Enter the radius of the circle: ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Error: Empty input. Please enter a value for the radius.");
            } else if (!isNumeric(input)) {
                System.out.println("Error: Invalid input. Please enter a numeric value for the radius.");
            } else {
                radius = Double.parseDouble(input);
                if (radius <= 0) {
                    System.out.println("Error: Please enter a positive number for the radius.");
                } else {
                    isValidInput = true;
                }
            }
        }

        scanner.close();

        double area = Circle.getArea(radius);

        System.out.println("The area of the circle is: " + area);
    }


    private static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c) && c != '.') {
                return false;
            }
        }
        return true;
    }
}

