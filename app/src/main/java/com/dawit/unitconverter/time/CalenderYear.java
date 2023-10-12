package com.dawit.unitconverter.time;

import com.dawit.unitconverter.IConversion;

public class CalenderYear implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 3.154e+7);
    }


    public double fromBaseUnit(double value) {
        return (value / 3.154e+7);
    }
}
