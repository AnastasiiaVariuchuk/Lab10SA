package org.example.pMVVM;

import javafx.beans.property.DoubleProperty;

public interface PrismViewModel {
    void setBaseLength(double length);
    void setHeight(double height);
    DoubleProperty volumeProperty();
    DoubleProperty surfaceAreaProperty();
}
