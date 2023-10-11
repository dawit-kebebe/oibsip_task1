package com.dawit.unitconverter.length;

import com.dawit.unitconverter.IConversion;

public class Yard implements IConversion {
    @Override
    public double toBaseUnit(double value) {
        return (value / 1.094);
    }

    @Override
    public double fromBaseUnit(double value) {
        return (value * 1.094);
    }
}
