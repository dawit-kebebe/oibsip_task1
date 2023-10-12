package com.dawit.unitconverter.data_transfer_rate;

import com.dawit.unitconverter.IConversion;

public class KibibitPerSecond implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 1024);
    }


    public double fromBaseUnit(double value) {
        return (value / 1024);
    }
}
