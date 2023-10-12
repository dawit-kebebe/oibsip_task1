package com.dawit.unitconverter.plane_angle;

import com.dawit.unitconverter.IConversion;

public class MinuteOfArc implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * (3.14/(60*180)));
    }


    public double fromBaseUnit(double value) {
        return (value * ((60*180)/3.14));
    }
}
