package com.dawit.unitconverter.volume;

import com.dawit.unitconverter.IConversion;

public class CubicInch implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 6.102e+4);
    }


    public double fromBaseUnit(double value) {
        return (value * 6.102e+4);
    }
}
