package com.dawit.unitconverter.time;

import com.dawit.unitconverter.IConversion;

public class Century implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 3.154e+9);
    }


    public double fromBaseUnit(double value) {
        return (value / 3.154e+9);
    }
}
