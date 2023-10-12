package com.dawit.unitconverter.energy;

import com.dawit.unitconverter.IConversion;

public class WattHour implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 3600);
    }


    public double fromBaseUnit(double value) {
        return (value / 3600);
    }
}
