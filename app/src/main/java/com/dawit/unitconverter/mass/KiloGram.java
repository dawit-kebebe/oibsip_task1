package com.dawit.unitconverter.mass;

import com.dawit.unitconverter.IConversion;

public class KiloGram implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 1e+3);
    }


    public double fromBaseUnit(double value) {
        return (value / 1e+3);
    }
}
