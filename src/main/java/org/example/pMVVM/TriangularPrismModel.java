package org.example.pMVVM;

public class TriangularPrismModel implements PrismModel {
    private double baseLength;
    private double height;

    @Override
    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return 0.5 * baseLength * height;
    }

    @Override
    public double calculateSurfaceArea() {
        double baseArea = 0.5 * baseLength * height;
        double sideArea = 3 * baseLength * height;
        return 2 * baseArea + sideArea;
    }

}
