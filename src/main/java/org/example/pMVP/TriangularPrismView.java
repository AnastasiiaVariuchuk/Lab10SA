package org.example.pMVP;

import java.util.Scanner;

public class TriangularPrismView implements PrismView {
    private TriangularPrismPresenter presenter;

    public TriangularPrismView() {
        presenter = new TriangularPrismPresenter(this);
    }

    @Override
    public double getHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the triangular prism: ");
        return scanner.nextDouble();
    }

    @Override
    public double getBaseLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base length of the triangular prism: ");
        return scanner.nextDouble();
    }

    @Override
    public void displayResult(double volume, double surfaceArea) {
        System.out.println("Volume of the triangular prism: " + volume);
        System.out.println("Surface area of the triangular prism: " + surfaceArea);
    }

    @Override
    public void requestCalculation() {
        double height = getHeight();
        double baseLength = getBaseLength();
        presenter.calculatePrismVolumeAndArea(baseLength, height);
    }
}
