package com.dawit.unitconverter.volume;

import com.dawit.unitconverter.IConversion;

public class UsLiquidGallon implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 264.2);
    }


    public double fromBaseUnit(double value) {
        return (value * 264.2);
    }
}
