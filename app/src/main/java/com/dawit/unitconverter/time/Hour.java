package com.dawit.unitconverter.time;

import com.dawit.unitconverter.IConversion;

public class Hour implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 3.6e+3);
    }


    public double fromBaseUnit(double value) {
        return (value / 3.6e+3);
    }
}
