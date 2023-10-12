package com.dawit.unitconverter.volume;

import com.dawit.unitconverter.IConversion;

public class ImperialQuart implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 879.9);
    }


    public double fromBaseUnit(double value) {
        return (value * 879.9);
    }
}
