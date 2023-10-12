package com.dawit.unitconverter.time;

import com.dawit.unitconverter.IConversion;

public class MicroSecond implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 1e+6);
    }


    public double fromBaseUnit(double value) {
        return (value * 1e+6);
    }
}
