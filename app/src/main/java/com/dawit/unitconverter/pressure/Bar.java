package com.dawit.unitconverter.pressure;

import com.dawit.unitconverter.IConversion;

public class Bar implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 1e+5);
    }


    public double fromBaseUnit(double value) {
        return (value / 1e+5);
    }
}
