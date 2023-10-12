package com.dawit.unitconverter.area;

import com.dawit.unitconverter.IConversion;

public class SquareYard implements IConversion
{
	public double toBaseUnit(double value) {
        return (value / 1.196);
    }


    public double fromBaseUnit(double value) {
        return (value * 1.196);
    }
}
