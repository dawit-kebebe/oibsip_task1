package com.dawit.unitconverter.volume;

import com.dawit.unitconverter.IConversion;

public class UsLiquidQuart implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 1057);
    }


    public double fromBaseUnit(double value) {
        return (value * 1057);
    }
}
