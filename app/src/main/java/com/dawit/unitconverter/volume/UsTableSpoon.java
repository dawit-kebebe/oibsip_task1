package com.dawit.unitconverter.volume;

import com.dawit.unitconverter.IConversion;

public class UsTableSpoon implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 6.763e+4);
    }


    public double fromBaseUnit(double value) {
        return (value * 6.763e+4);
    }
}
