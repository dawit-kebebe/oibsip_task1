package com.dawit.unitconverter.mass;

import com.dawit.unitconverter.IConversion;

public class Stone implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 6350);
    }


    public double fromBaseUnit(double value) {
        return (value / 6350);
    }
}
