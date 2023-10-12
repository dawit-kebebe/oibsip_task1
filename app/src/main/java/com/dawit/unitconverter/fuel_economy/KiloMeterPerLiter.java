package com.dawit.unitconverter.fuel_economy;

import com.dawit.unitconverter.IConversion;

public class KiloMeterPerLiter implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 1e+9);
    }


    public double fromBaseUnit(double value) {
        return (value / 1e+9);
    }
}
