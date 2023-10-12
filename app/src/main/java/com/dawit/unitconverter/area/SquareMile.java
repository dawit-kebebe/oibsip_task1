package com.dawit.unitconverter.area;

import com.dawit.unitconverter.IConversion;

public class SquareMile implements IConversion
{

	public double toBaseUnit(double value) {
        return (value * 2.59e+6);
    }


    public double fromBaseUnit(double value) {
        return (value / 2.59e+6);
    }
}
