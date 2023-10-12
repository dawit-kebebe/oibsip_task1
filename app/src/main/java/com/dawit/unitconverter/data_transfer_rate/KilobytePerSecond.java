package com.dawit.unitconverter.data_transfer_rate;

import com.dawit.unitconverter.IConversion;

public class KilobytePerSecond implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 8e+3);
    }


    public double fromBaseUnit(double value) {
        return (value / 8e+3);
    }
}
