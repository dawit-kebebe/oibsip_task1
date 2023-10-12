package com.dawit.unitconverter.energy;

import com.dawit.unitconverter.IConversion;

public class KiloCalorie implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 4184);
    }


    public double fromBaseUnit(double value) {
        return (value / 4184);
    }
}
