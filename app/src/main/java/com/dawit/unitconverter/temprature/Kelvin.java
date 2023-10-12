package com.dawit.unitconverter.temprature;

import com.dawit.unitconverter.IConversion;

public class Kelvin implements IConversion
{
    public double toBaseUnit(double value) {
        return (value - 273.15);
    }


    public double fromBaseUnit(double value) {
        return (value + 273.15);
    }
}
