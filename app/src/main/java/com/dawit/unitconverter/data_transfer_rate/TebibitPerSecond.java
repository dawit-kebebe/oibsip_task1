package com.dawit.unitconverter.data_transfer_rate;

import com.dawit.unitconverter.IConversion;

public class TebibitPerSecond implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 1.1e+12);
    }


    public double fromBaseUnit(double value) {
        return (value / 1.1e+12);
    }
}
