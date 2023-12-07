package org.example.pMVVM;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class TriangularPrismViewModel implements PrismViewModel {
    private PrismModel model;
    private DoubleProperty baseLength;
    private DoubleProperty height;
    private DoubleProperty volume;
    private DoubleProperty surfaceArea;

    public TriangularPrismViewModel() {
        model = new TriangularPrismModel();
        baseLength = new SimpleDoubleProperty();
        height = new SimpleDoubleProperty();
        volume = new SimpleDoubleProperty();
        surfaceArea = new SimpleDoubleProperty();
    }

    @Override
    public void setBaseLength(double length) {
        baseLength.set(length);
        model.setBaseLength(length);
        calculate();
    }

    @Override
    public void setHeight(double height) {
        this.height.set(height);
        model.setHeight(height);
        calculate();
    }

    void calculate() {
        volume.set(model.calculateVolume());
        surfaceArea.set(model.calculateSurfaceArea());
    }

    @Override
    public DoubleProperty volumeProperty() {
        return volume;
    }

    @Override
    public DoubleProperty surfaceAreaProperty() {
        return surfaceArea;
    }
}
