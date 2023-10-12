package com.dawit.unitconverter.plane_angle;

import com.dawit.unitconverter.IConversion;

public class Gradian implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * (3.14/200));
    }


    public double fromBaseUnit(double value) {
        return (value * (200/3.14));
    }
}
