package org.example.old.MVVM;

public class TriangularPrismModel {
    private double baseLength;
    private double height;

    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateVolume() {
        return (baseLength * baseLength * height) / 2.0;
    }

    public double calculateSurfaceArea() {
        double baseArea = baseLength * baseLength;
        double triangleArea = (baseLength * height) / 2.0;
        return 2 * baseArea + 3 * triangleArea;
    }
}
