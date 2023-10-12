package com.dawit.unitconverter.volume;

import com.dawit.unitconverter.IConversion;

public class UsTeaSpoon implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 2.029e+5);
    }


    public double fromBaseUnit(double value) {
        return (value * 2.029e+5);
    }
}
