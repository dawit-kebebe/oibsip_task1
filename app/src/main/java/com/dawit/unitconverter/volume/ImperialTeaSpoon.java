package com.dawit.unitconverter.volume;

import com.dawit.unitconverter.IConversion;

public class ImperialTeaSpoon implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 1.689e+5);
    }


    public double fromBaseUnit(double value) {
        return (value * 1.689e+5);
    }
}
