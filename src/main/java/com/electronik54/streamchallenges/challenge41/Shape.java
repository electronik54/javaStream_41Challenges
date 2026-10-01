package com.electronik54.streamchallenges.challenge41;

/** A shape of the drawing application. Sealed, so only a circle or a rectangle can be a shape. */
public sealed interface Shape permits Shape.Circle, Shape.Rectangle {

    double area();

    /** A circle described by its radius. */
    record Circle(double radius) implements Shape {
        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    /** A rectangle described by its width and height. */
    record Rectangle(double width, double height) implements Shape {
        @Override
        public double area() {
            return width * height;
        }
    }
}
