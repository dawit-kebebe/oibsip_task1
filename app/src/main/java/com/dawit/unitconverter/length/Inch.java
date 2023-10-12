package com.dawit.unitconverter.length;

import com.dawit.unitconverter.IConversion;

public class Inch implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 39.37);
    }


    public double fromBaseUnit(double value) {
        return (value * 39.37);
    }
}
