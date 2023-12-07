package org.example.old.MVP;

public class TriangularPrismPresenter {
    private TriangularPrismModel model;
    private TriangularPrismView view;

    public TriangularPrismPresenter(TriangularPrismView view) {
        this.view = view;
        model = new TriangularPrismModel();
    }

    public void calculatePrismVolumeAndArea(double baseLength, double height) {
        double volume = model.calculateVolume(baseLength, height);
        double surfaceArea = model.calculateSurfaceArea(baseLength, height);
        view.displayResult(volume, surfaceArea);
    }
}
