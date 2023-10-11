package com.dawit.unitconverter.length;

import com.dawit.unitconverter.IConversion;

public class Centimeter implements IConversion {
    @Override
    public double toBaseUnit(double value) {
        return (value / 100);
    }

    @Override
    public double fromBaseUnit(double value) {
        return (value * 100);
    }
}
