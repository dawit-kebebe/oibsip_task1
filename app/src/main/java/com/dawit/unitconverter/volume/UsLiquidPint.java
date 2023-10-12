package com.dawit.unitconverter.volume;

import com.dawit.unitconverter.IConversion;

public class UsLiquidPint implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 2113);
    }


    public double fromBaseUnit(double value) {
        return (value * 2113);
    }
}
