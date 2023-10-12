package com.dawit.unitconverter.volume;

import com.dawit.unitconverter.IConversion;

public class ImperialCup implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 3.52e+3);
    }


    public double fromBaseUnit(double value) {
        return (value * 3.52e+3);
    }
}
