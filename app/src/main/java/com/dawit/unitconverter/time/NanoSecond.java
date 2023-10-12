package com.dawit.unitconverter.time;

import com.dawit.unitconverter.IConversion;

public class NanoSecond implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 1e+9);
    }


    public double fromBaseUnit(double value) {
        return (value * 1e+9);
    }
}
