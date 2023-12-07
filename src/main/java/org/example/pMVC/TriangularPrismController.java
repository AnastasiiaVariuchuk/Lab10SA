package org.example.pMVC;

public class TriangularPrismController {
    private PrismModel model;
    private PrismView view;

    public TriangularPrismController(PrismModel model, PrismView view) {
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
