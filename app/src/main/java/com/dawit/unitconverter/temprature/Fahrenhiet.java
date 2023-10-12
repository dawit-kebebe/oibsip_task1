package com.dawit.unitconverter.temprature;

import com.dawit.unitconverter.IConversion;

public class Fahrenhiet implements IConversion
{
    public double toBaseUnit(double value) {
        return ((value - 32)* (5/9));
    }


    public double fromBaseUnit(double value) {
        return ((value *(9/5))+ 32 );
    }
}
