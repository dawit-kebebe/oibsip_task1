package com.dawit.unitconverter.length;

import com.dawit.unitconverter.IConversion;

public class Millimetre implements IConversion {
    @Override
    public double toBaseUnit(double value) {
        return (value / 1000);
    }

    @Override
    public double fromBaseUnit(double value) {
        return (value * 1000);
    }
}
