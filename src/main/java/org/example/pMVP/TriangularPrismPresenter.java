package org.example.pMVP;

public class TriangularPrismPresenter {
    private PrismModel model;
    private PrismView view;

    public TriangularPrismPresenter(PrismView view) {
        this.view = view;
        model = new TriangularPrismModel();
    }

    public void calculatePrismVolumeAndArea(double baseLength, double height) {
        double volume = model.calculateVolume(baseLength, height);
        double surfaceArea = model.calculateSurfaceArea(baseLength, height);
        view.displayResult(volume, surfaceArea);
    }
}
