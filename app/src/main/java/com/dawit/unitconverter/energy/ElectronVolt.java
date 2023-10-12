package com.dawit.unitconverter.energy;

import com.dawit.unitconverter.IConversion;

public class ElectronVolt implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 6.242e+18);
    }


    public double fromBaseUnit(double value) {
        return (value * 6.242e+18);
    }
}
