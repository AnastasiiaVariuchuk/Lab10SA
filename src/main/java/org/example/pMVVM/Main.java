package org.example.pMVVM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriangularPrismViewModel viewModel = new TriangularPrismViewModel();

        System.out.print("Enter the base length of the triangular prism: ");
        double baseLength = scanner.nextDouble();
        viewModel.setBaseLength(baseLength);

        System.out.print("Enter the height of the triangular prism: ");
        double height = scanner.nextDouble();
        viewModel.setHeight(height);

        System.out.println("Volume of the triangular prism: " + viewModel.volumeProperty().get());
        System.out.println("Surface area of the triangular prism: " + viewModel.surfaceAreaProperty().get());
    }
}
