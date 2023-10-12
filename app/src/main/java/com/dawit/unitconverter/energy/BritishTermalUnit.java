package com.dawit.unitconverter.energy;

import com.dawit.unitconverter.IConversion;

public class BritishTermalUnit implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 1055);
    }


    public double fromBaseUnit(double value) {
        return (value / 1055);
    }
}
