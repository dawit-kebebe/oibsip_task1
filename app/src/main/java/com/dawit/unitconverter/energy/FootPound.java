package com.dawit.unitconverter.energy;

import com.dawit.unitconverter.IConversion;

public class FootPound implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 1.356);
    }


    public double fromBaseUnit(double value) {
        return (value / 1.356);
    }
}
