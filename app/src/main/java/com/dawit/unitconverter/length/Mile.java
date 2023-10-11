package com.dawit.unitconverter.length;

import com.dawit.unitconverter.IConversion;

public class Mile implements IConversion {
    @Override
    public double toBaseUnit(double value) {
        return (value * 1609.34);
    }

    @Override
    public double fromBaseUnit(double value) {
        return (value / 1609.34);
    }
}
