package org.example.pMVP;

public interface PrismView {
    double getHeight();
    double getBaseLength();
    void displayResult(double volume, double surfaceArea);
    void requestCalculation();
}
