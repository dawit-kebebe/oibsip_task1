package com.dawit.unitconverter.length;

import com.dawit.unitconverter.IConversion;

public class Nanometre implements IConversion {
    @Override
    public double toBaseUnit(double value) {
        return (value / 1e+9);
    }

    @Override
    public double fromBaseUnit(double value) {
        return (value * 1e+9);
    }
}
