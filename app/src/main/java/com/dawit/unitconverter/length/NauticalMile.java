package com.dawit.unitconverter.length;

import com.dawit.unitconverter.IConversion;

public class NauticalMile implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 1852);
    }


    public double fromBaseUnit(double value) {
        return (value / 1852);
    }
}
