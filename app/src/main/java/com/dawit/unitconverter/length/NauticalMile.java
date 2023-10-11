package com.dawit.unitconverter.length;

import com.dawit.unitconverter.IConversion;

public class NauticalMile implements IConversion {
    @Override
    public double toBaseUnit(double value) {
        return (value * 1852);
    }

    @Override
    public double fromBaseUnit(double value) {
        return (value / 1852);
    }
}
