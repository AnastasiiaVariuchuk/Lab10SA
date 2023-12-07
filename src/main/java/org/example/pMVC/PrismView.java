package org.example.pMVC;

import java.util.Scanner;

public interface PrismView {
    double getHeight();
    double getBaseLength();
    void displayResult(double volume, double surfaceArea);
}
