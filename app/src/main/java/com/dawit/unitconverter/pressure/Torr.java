package com.dawit.unitconverter.pressure;

import com.dawit.unitconverter.IConversion;

public class Torr implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 133.3);
    }


    public double fromBaseUnit(double value) {
        return (value / 133.3);
    }
}
