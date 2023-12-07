package org.example.old.MVC;

public class TriangularPrismController {
    private TriangularPrismModel model;
    private TriangularPrismView view;

    public TriangularPrismController(TriangularPrismModel model, TriangularPrismView view) {
        this.model = model;
        this.view = view;
    }

    public void processPrism() {
        double height = view.getHeight();
        double baseLength = view.getBaseLength();

        double volume = model.calculateVolume(baseLength, height);
        double surfaceArea = model.calculateSurfaceArea(baseLength, height);

        view.displayResult(volume, surfaceArea);
    }
}
