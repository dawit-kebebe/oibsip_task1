package com.dawit.unitconverter.speed;

import com.dawit.unitconverter.IConversion;

public class Knot implements IConversion
{
    public double toBaseUnit(double value) {
        return (value / 1.944);
    }


    public double fromBaseUnit(double value) {
        return (value * 1.944);
    }
}
