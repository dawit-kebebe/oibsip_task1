package com.dawit.unitconverter.volume;

import com.dawit.unitconverter.IConversion;

public class FluidOunce implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 3.381e+4);
    }


    public double fromBaseUnit(double value) {
        return (value * 3.381e+4);
    }
}
