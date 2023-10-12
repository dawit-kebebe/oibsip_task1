package com.dawit.unitconverter.data_transfer_rate;

import com.dawit.unitconverter.IConversion;

public class MebibitPerSecond implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 1.049e+6);
    }


    public double fromBaseUnit(double value) {
        return (value / 1.049e+6);
    }
}
