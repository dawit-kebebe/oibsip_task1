package com.dawit.unitconverter.mass;

import com.dawit.unitconverter.IConversion;

public class UsTon implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 9.072e+5);
    }


    public double fromBaseUnit(double value) {
        return (value / 9.072e+5);
    }
}
