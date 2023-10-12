package com.dawit.unitconverter.plane_angle;

import com.dawit.unitconverter.IConversion;

public class Arcsecond implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * (3.14/(180*3600)));
    }


    public double fromBaseUnit(double value) {
        return (value * ((3600*180)/3.14));
    }
}
