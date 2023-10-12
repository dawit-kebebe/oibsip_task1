package com.dawit.unitconverter.energy;

import com.dawit.unitconverter.IConversion;

public class KiloWattHour implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 3.6e+6);
    }


    public double fromBaseUnit(double value) {
        return (value / 3.6e+6);
    }
}
