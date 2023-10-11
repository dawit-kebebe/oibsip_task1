package com.dawit.unitconverter.length;

import com.dawit.unitconverter.IConversion;

public class Inch implements IConversion {
    @Override
    public double toBaseUnit(double value) {
        return (value / 39.37);
    }

    @Override
    public double fromBaseUnit(double value) {
        return (value * 39.37);
    }
}
