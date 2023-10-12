package com.dawit.unitconverter.data_transfer_rate;

import com.dawit.unitconverter.IConversion;

public class TerabitPerSecond implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 1e+12);
    }


    public double fromBaseUnit(double value) {
        return (value / 1e+12);
    }
}
