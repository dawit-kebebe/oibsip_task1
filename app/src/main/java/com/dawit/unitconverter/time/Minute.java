package com.dawit.unitconverter.time;

import com.dawit.unitconverter.IConversion;

public class Minute implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 60);
    }


    public double fromBaseUnit(double value) {
        return (value / 60);
    }
}
