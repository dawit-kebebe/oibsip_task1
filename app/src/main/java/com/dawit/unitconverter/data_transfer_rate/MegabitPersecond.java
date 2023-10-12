package com.dawit.unitconverter.data_transfer_rate;

import com.dawit.unitconverter.IConversion;

public class MegabitPersecond implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 1e+6);
    }


    public double fromBaseUnit(double value) {
        return (value / 1e+6);
    }
}
