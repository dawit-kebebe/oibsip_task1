package com.dawit.unitconverter.plane_angle;

import com.dawit.unitconverter.IConversion;

public class MilliRadian implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 1e+3);
    }


    public double fromBaseUnit(double value) {
        return (value * 1e+3);
    }
}
