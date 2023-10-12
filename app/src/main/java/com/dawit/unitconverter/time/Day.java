package com.dawit.unitconverter.time;

import com.dawit.unitconverter.IConversion;

public class Day implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 8.64e+4);
    }


    public double fromBaseUnit(double value) {
        return (value / 8.64e+4);
    }
}
