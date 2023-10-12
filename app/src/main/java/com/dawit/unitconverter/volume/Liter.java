package com.dawit.unitconverter.volume;

import com.dawit.unitconverter.IConversion;

public class Liter implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 1e+3);
    }


    public double fromBaseUnit(double value) {
        return (value * 1e+3);
    }
}
