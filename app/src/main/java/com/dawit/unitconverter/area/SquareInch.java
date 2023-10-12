package com.dawit.unitconverter.area;

import com.dawit.unitconverter.IConversion;

public class SquareInch implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 1550);
    }


    public double fromBaseUnit(double value) {
        return (value * 1550);
    }
}
