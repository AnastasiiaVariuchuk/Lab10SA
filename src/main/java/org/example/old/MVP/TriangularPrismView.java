package org.example.old.MVP;

import java.util.Scanner;

public class TriangularPrismView {
    private TriangularPrismPresenter presenter;

    public TriangularPrismView() {
        presenter = new TriangularPrismPresenter(this);
    }

    public double getHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть висоту трикутної призми: ");
        return scanner.nextDouble();
    }

    public double getBaseLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть довжину сторони основи трикутної призми: ");
        return scanner.nextDouble();
    }

    public void displayResult(double volume, double surfaceArea) {
        System.out.println("Об'єм трикутної призми: " + volume);
        System.out.println("Площа поверхні трикутної призми: " + surfaceArea);
    }

    public void requestCalculation() {
        double height = getHeight();
        double baseLength = getBaseLength();
        presenter.calculatePrismVolumeAndArea(baseLength, height);
    }
}
