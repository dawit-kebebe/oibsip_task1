package com.dawit.unitconverter.mass;

import com.dawit.unitconverter.IConversion;

public class Pound implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 453.6);
    }


    public double fromBaseUnit(double value) {
        return (value  / 453.6);
    }
}
