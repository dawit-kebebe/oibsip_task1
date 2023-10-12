package com.dawit.unitconverter.energy;

import com.dawit.unitconverter.IConversion;

public class GramCalorie implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 4.184);
    }


    public double fromBaseUnit(double value) {
        return (value / 4.184);
    }
}
