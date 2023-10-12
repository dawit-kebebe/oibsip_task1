package com.dawit.unitconverter.time;

import com.dawit.unitconverter.IConversion;

public class Month implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 2.628e+6);
    }


    public double fromBaseUnit(double value) {
        return (value / 2.628e+6);
    }
}
