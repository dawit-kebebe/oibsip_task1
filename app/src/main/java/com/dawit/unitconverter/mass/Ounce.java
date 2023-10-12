package com.dawit.unitconverter.mass;

import com.dawit.unitconverter.IConversion;

public class Ounce implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 28.35);
    }


    public double fromBaseUnit(double value) {
        return (value / 28.35);
    }
}
