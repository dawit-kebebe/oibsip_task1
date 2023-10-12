package com.dawit.unitconverter.area;

import com.dawit.unitconverter.IConversion;

public class SquareFoot implements IConversion
{
	public double toBaseUnit(double value) {
        return (value / 10.764);
    }


    public double fromBaseUnit(double value) {
        return (value * 10.764);
    }
}
