package com.dawit.unitconverter.speed;

import com.dawit.unitconverter.IConversion;

public class MilePerHour implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 2.237);
    }


    public double fromBaseUnit(double value) {
        return (value * 2.237);
    }
}
