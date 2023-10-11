package com.dawit.unitconverter;

public class Converter {
//    public enum Categories {
//        AREA,
//        DATA_TRANSFER_RATE,
//        DIGITAL_STORAGE,
//        ENERGY,
//        FREQUENCY,
//        FUEL_ECONOMY,
//        LENGTH,
//        MASS,
//        PLANE_ANGLE,
//        PRESSURE,
//        SPEED,
//        TEMPERATURE,
//        TIME,
//        VOLUME
//    }

    private IConversion fromUnit;
    private IConversion toUnit;
    private double value;

    public Converter(double value, IConversion fromUnit, IConversion toUnit){
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.value = value;
    }

    public double convert() {
        if (this.fromUnit == null){
            return 0.0;
        }

        if (this.toUnit == null) {
            return fromUnit.toBaseUnit(this.value);
        }
        return this.toUnit.fromBaseUnit(fromUnit.toBaseUnit(this.value));
    }

}
