package com.dawit.unitconverter.area;

import com.dawit.unitconverter.IConversion;

public class Hectare implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 1e+4);
    }


    public double fromBaseUnit(double value) {
        return (value / 1e+4);
    }
}
