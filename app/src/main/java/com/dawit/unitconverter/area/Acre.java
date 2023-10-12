package com.dawit.unitconverter.area;

import com.dawit.unitconverter.IConversion;

public class Acre implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 4047);
    }


    public double fromBaseUnit(double value) {
        return (value / 4047);
    }
}
