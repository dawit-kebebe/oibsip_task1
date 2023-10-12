package com.dawit.unitconverter.energy;

import com.dawit.unitconverter.IConversion;

public class UsTherm implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 1.055e+8);
    }


    public double fromBaseUnit(double value) {
        return (value / 1.055e+8);
    }
}
