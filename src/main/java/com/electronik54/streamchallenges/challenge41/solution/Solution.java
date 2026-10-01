package com.electronik54.streamchallenges.challenge41.solution;

import com.electronik54.streamchallenges.challenge41.Shape;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/*
 * Solution 41: Sealed Types and Records in a Stream - how it works
 *
 * Shape is sealed, so only Circle and Rectangle can implement it and the compiler knows that no
 * third subtype can arrive at runtime. Every record implements area() with its own formula, and
 * the stream calls it through the interface method - no instanceof cascade is needed to compute
 * the areas.
 *
 * mapToDouble(Shape::area) keeps the arithmetic on primitive doubles, so sum() and
 * comparingDouble never box a value. The areas are formatted with Locale.ROOT, because the
 * default locale decides whether 12.57 is printed with a point or with a comma.
 *
 * On JDK 21 the same list could be grouped with pattern matching for switch, because a sealed
 * hierarchy makes the switch exhaustive:
 *
 *     String kind = switch (shape) {
 *         case Shape.Circle circle -> "circle";
 *         case Shape.Rectangle rectangle -> "rectangle";
 *     };
 *
 * Record patterns would then read the components directly (case Shape.Circle(var radius) -> ...)
 * and shapes.getFirst() would read the first element of the list. Those forms need JDK 21 to
 * compile, so this solution keeps the JDK 17-compatible equivalents and documents the newer
 * ones in the challenge hints.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 41: Sealed Types and Records in a Stream ===");

        List<Shape> shapes = List.of(
                new Shape.Circle(2),
                new Shape.Rectangle(3, 4),
                new Shape.Circle(1),
                new Shape.Rectangle(2, 5));
        System.out.println("Shapes: " + shapes);

        List<String> areas = shapes.stream()
                .map(shape -> String.format(Locale.ROOT, "%.2f", shape.area()))
                .toList();
        System.out.println("Areas: " + areas);

        double totalArea = shapes.stream().mapToDouble(Shape::area).sum();
        System.out.println("Total area: " + String.format(Locale.ROOT, "%.2f", totalArea));

        Shape largest = shapes.stream()
                .max(Comparator.comparingDouble(Shape::area))
                .orElseThrow();
        System.out.println("Largest shape: " + largest);

        long circles = shapes.stream().filter(Shape.Circle.class::isInstance).count();
        long rectangles = shapes.stream().filter(Shape.Rectangle.class::isInstance).count();
        System.out.println("Circles: " + circles + ", Rectangles: " + rectangles);
    }
}
