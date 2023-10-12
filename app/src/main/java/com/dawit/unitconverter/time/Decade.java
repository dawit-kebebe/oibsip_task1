package com.dawit.unitconverter.time;

import com.dawit.unitconverter.IConversion;

public class Decade implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 3.154e+8);
    }


    public double fromBaseUnit(double value) {
        return (value / 3.154e+8);
    }
}
