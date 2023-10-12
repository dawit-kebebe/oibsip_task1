package com.dawit.unitconverter.data_transfer_rate;

import com.dawit.unitconverter.IConversion;

public class GebibitPerSecond implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 1.074e+9);
    }


    public double fromBaseUnit(double value) {
        return (value / 1.074e+9);
    }
}
