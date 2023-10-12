package com.dawit.unitconverter.length;

import com.dawit.unitconverter.IConversion;

public class Nanometer implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 1e+9);
    }


    public double fromBaseUnit(double value) {
        return (value * 1e+9);
    }
}
