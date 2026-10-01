package com.electronik54.streamchallenges.challenge41;

import java.util.List;

/**
 * Challenge 41: Sealed Types and Records in a Stream
 *
 * Problem:
 * A list holds circles and rectangles. Print the area of every shape with two decimals, the
 * total area, the largest shape and how many shapes of each kind the list holds.
 *
 * Hint:
 * - Shape is a sealed interface with two record implementations, so the compiler knows the
 *   complete list of subtypes and every record brings its own area() formula
 * - mapToDouble(Shape::area).sum() adds the areas on primitives, without boxing
 * - max(Comparator.comparingDouble(Shape::area)) picks the largest shape
 * - Shape.Circle.class::isInstance counts the shapes of one kind
 * - JDK 21 offers two shorter forms that this file avoids so that it also compiles on JDK 17:
 *   pattern matching for switch (case Shape.Circle circle -> ...) works on a sealed hierarchy
 *   without a default branch, and the SequencedCollection methods getFirst() and getLast() read
 *   the ends of a List directly
 *
 * Expected Output:
 * Shapes: [Circle[radius=2.0], Rectangle[width=3.0, height=4.0], Circle[radius=1.0], Rectangle[width=2.0, height=5.0]]
 * Areas: [12.57, 12.00, 3.14, 10.00]
 * Total area: 37.71
 * Largest shape: Circle[radius=2.0]
 * Circles: 2, Rectangles: 2
 *
 * TODO:
 * 1. Build the shape list of the problem statement
 * 2. Format the area of every shape and sum the areas
 * 3. Print the largest shape and the number of shapes per kind
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 41: Sealed Types and Records in a Stream ===");

        // TODO 1: the input of the problem statement
        List<Shape> shapes = List.of(
                new Shape.Circle(2),
                new Shape.Rectangle(3, 4),
                new Shape.Circle(1),
                new Shape.Rectangle(2, 5));
        System.out.println("Shapes: " + shapes);

        // TODO 2: map every shape to its area and sum the areas
        // List<String> areas = shapes.stream()...;
        // double totalArea = shapes.stream()...;

        // TODO 3: print the areas, the total, the largest shape and the counts per kind
        // System.out.println("Areas: " + areas);
        // System.out.println("Total area: " + ...);
        // System.out.println("Largest shape: " + ...);
        // System.out.println("Circles: " + circles + ", Rectangles: " + rectangles);
    }
}
