package com.dawit.unitconverter.energy;

import com.dawit.unitconverter.IConversion;

public class Kilojoule implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 1e+3);
    }


    public double fromBaseUnit(double value) {
        return (value / 1e+3);
    }
    
}
