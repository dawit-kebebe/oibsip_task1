package com.dawit.unitconverter.length;

import com.dawit.unitconverter.IConversion;

public class Micrometer implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 1e+6);
    }


    public double fromBaseUnit(double value) {
        return (value * 1e+6);
    }
}
