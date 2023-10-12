package com.dawit.unitconverter.pressure;

import com.dawit.unitconverter.IConversion;

public class PoundPerSquareInch implements IConversion
{
    public double toBaseUnit(double value) {
        return (value * 6895);
    }


    public double fromBaseUnit(double value) {
        return (value / 6895);
    }
}
