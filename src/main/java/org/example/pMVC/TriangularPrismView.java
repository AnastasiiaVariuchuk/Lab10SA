package org.example.pMVC;

import java.util.Scanner;

public class TriangularPrismView implements PrismView {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public double getHeight() {
        System.out.print("Enter the height of the triangular prism: ");
        return scanner.nextDouble();
    }

    @Override
    public double getBaseLength() {
        System.out.print("Enter the base length of the triangular prism: ");
        return scanner.nextDouble();
    }

    @Override
    public void displayResult(double volume, double surfaceArea) {
        System.out.println("Volume of the triangular prism: " + volume);
        System.out.println("Surface area of the triangular prism: " + surfaceArea);
    }
}
