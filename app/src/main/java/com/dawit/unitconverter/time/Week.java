package com.dawit.unitconverter.time;

import com.dawit.unitconverter.IConversion;

public class Week implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 6.048e+5);
    }


    public double fromBaseUnit(double value) {
        return (value  / 6.048e+5);
    }
}
