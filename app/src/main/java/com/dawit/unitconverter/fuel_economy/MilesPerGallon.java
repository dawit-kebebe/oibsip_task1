package com.dawit.unitconverter.fuel_economy;

import com.dawit.unitconverter.IConversion;

public class MilesPerGallon implements IConversion
{
    public double toBaseUnit(double value) {
        return (235.215 / value);
    }


    public double fromBaseUnit(double value) {
        return (235.215 * value);
    }
}
