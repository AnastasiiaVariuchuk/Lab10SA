package org.example.old.MVVM;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class TriangularPrismViewModel {
    private TriangularPrismModel model;
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

    public void setBaseLength(double length) {
        baseLength.set(length);
        model.setBaseLength(length);
        calculate();
    }

    public void setHeight(double height) {
        this.height.set(height);
        model.setHeight(height);
        calculate();
    }

    private void calculate() {
        volume.set(model.calculateVolume());
        surfaceArea.set(model.calculateSurfaceArea());
    }

    public DoubleProperty volumeProperty() {
        return volume;
    }

    public DoubleProperty surfaceAreaProperty() {
        return surfaceArea;
    }
}
