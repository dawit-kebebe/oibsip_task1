package com.dawit.unitconverter.area;

public class SquareKilometer {

    private double val = 0.0d;

    public SquareKilometer(double val) {
        this.val = val;
    }

//    public double convert(){
//        return
//    }

    private double toSquareMeter(double val){
        return (val * 1e+6);
    }

    private double toSquareMile(double val){
        return (val / 2.59);
    }

    private double toSquareYard(double val){
        return (val * 1.196e+6);
    }

    private double toSquareFoot(double val){
        return (val * 1.076e+7);
    }

    private double toSquareInch(double val){
        return (val * 1.55e+9);
    }

    private double toHectare(double val){
        return (val * 100);
    }

    private double toAcre(double val){
        return (val * 247.1);
    }
}
