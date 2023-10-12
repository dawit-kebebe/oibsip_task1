package com.dawit.unitconverter.volume;

import com.dawit.unitconverter.IConversion;

public class MilliLiter implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 1e+6);
    }


    public double fromBaseUnit(double value) {
        return (value * 1e+6);
    }
}
