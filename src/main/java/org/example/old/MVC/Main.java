package org.example.old.MVC;

public class Main {
    public static void main(String[] args) {
        TriangularPrismModel model = new TriangularPrismModel();
        TriangularPrismView view = new TriangularPrismView();
        TriangularPrismController controller = new TriangularPrismController(model, view);
        controller.processPrism();
    }
}
