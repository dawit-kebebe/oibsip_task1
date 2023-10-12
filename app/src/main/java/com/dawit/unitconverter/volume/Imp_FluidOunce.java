package com.dawit.unitconverter.volume;

import com.dawit.unitconverter.IConversion;

public class Imp_FluidOunce implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 3.52e+4);
    }


    public double fromBaseUnit(double value) {
        return (value * 3.52e+4);
    }
}
