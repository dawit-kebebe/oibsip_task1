package com.dawit.unitconverter.length;

import com.dawit.unitconverter.IConversion;

public class Yard implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 1.094);
    }


    public double fromBaseUnit(double value) {
        return (value * 1.094);
    }
}
