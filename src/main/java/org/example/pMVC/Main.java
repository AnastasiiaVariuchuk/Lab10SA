package org.example.pMVC;

public class Main {
    public static void main(String[] args) {
        PrismModel model = new TriangularPrismModel();
        PrismView view = new TriangularPrismView();
        TriangularPrismController controller = new TriangularPrismController(model, view);
        controller.processPrism();
    }
}
