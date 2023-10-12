package com.dawit.unitconverter.speed;

import com.dawit.unitconverter.IConversion;

public class KilometerPerHour implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 3.6);
    }


    public double fromBaseUnit(double value) {
        return (value * 3.6);
    }
}
