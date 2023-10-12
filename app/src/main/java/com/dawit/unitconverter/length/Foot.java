package com.dawit.unitconverter.length;

import com.dawit.unitconverter.IConversion;

public class Foot implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 3.281);
    }


    public double fromBaseUnit(double value) {
        return (value * 3.281);
    }
}
