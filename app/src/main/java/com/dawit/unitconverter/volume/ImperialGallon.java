package com.dawit.unitconverter.volume;

import com.dawit.unitconverter.IConversion;

public class ImperialGallon implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 2.2e+2);
    }


    public double fromBaseUnit(double value) {
        return (value * 2.2e+2);
    }
}
