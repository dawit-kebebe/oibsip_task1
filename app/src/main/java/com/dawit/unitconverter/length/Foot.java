package com.dawit.unitconverter.length;

import com.dawit.unitconverter.IConversion;

public class Foot implements IConversion {
    @Override
    public double toBaseUnit(double value) {
        return (value * 3.281);
    }

    @Override
    public double fromBaseUnit(double value) {
        return (value / 3.281);
    }
}
