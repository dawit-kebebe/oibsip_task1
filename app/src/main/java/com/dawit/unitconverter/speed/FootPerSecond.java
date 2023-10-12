package com.dawit.unitconverter.speed;

import com.dawit.unitconverter.IConversion;

public class FootPerSecond implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 3.281);
    }


    public double fromBaseUnit(double value) {
        return (value * 3.281);
    }
}
