package com.dawit.unitconverter.volume;

import com.dawit.unitconverter.IConversion;

public class CubicFoot implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 35.315);
    }


    public double fromBaseUnit(double value) {
        return (value * 35.315);
    }
}
