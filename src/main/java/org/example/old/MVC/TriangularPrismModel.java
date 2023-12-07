package org.example.old.MVC;

public class TriangularPrismModel {
    public double calculateVolume(double baseLength, double height) {
        return 0.5 * baseLength * height;
    }

    public double calculateSurfaceArea(double baseLength, double height) {
        double baseArea = 0.5 * baseLength * height;
        double sideArea = 3 * baseLength * height;
        return 2 * baseArea + sideArea;
    }
}
