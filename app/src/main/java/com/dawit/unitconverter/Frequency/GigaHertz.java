package com.dawit.unitconverter.Frequency;

import com.dawit.unitconverter.IConversion;

public class GigaHertz implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 1e+9);
    }


    public double fromBaseUnit(double value) {
        return (value / 1e+9);
    }
}
