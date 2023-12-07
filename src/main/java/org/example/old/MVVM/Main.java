package org.example.old.MVVM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriangularPrismViewModel viewModel = new TriangularPrismViewModel();

        System.out.print("Введіть довжину сторони основи трикутної призми: ");
        double baseLength = scanner.nextDouble();
        viewModel.setBaseLength(baseLength);

        System.out.print("Введіть висоту трикутної призми: ");
        double height = scanner.nextDouble();
        viewModel.setHeight(height);

        System.out.println("Об'єм трикутної призми: " + viewModel.volumeProperty().get());
        System.out.println("Площа поверхні трикутної призми: " + viewModel.surfaceAreaProperty().get());
    }
}
