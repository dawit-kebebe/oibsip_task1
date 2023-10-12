package com.dawit.unitconverter.volume;

import com.dawit.unitconverter.IConversion;

public class ImperialTableSpoon implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 5.631e+4);
    }


    public double fromBaseUnit(double value) {
        return (value * 5.631e+4);
    }
}
