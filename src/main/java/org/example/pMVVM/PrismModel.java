package org.example.pMVVM;

public interface PrismModel {
    void setBaseLength(double baseLength);
    void setHeight(double height);
    double calculateVolume();
    double calculateSurfaceArea();
}
