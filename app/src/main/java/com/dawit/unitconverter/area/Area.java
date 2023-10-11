package com.dawit.unitconverter.area;

public class Area {

    private double val = 0.0;
    private String from = null;
    private String to = null;

    public Area(double val, String from, String to){
        this.val = val;
        this.from = from;
        this.to = to;
    }

    public double getVal() {
        return val;
    }

/**************************************************/
    private double squareMeterToSquareKilometer(double val){
        return (val / 1e+6);
    }

    private double squareMeterToSquareMile(double val){
        return (val / 2.59e+6);
    }

    private double squareMeterToSquareYard(double val){
        return (val * 1.196);
    }

    private double squareMeterToSquareFoot(double val){
        return (val * 10.764);
    }

    private double squareMeterToSquareInch(double val){
        return (val * 1550);
    }

    private double squareMeterToHectare(double val){
        return (val / 10000);
    }

    private double squareMeterToAcre(double val){
        return (val / 4047);
    }

    private double squareMileToSquareKilometer(double val){
        return (val * 2.59);
    }

    private double squareMileToSquareMeter(double val){
        return (val * 2.59e+6);
    }

    private double squareMileToSquareYard(double val){
        return (val * 3.098e+6);
    }

    private double squareMileToSquareFoot(double val){
        return (val * 2.788e+7);
    }

    private double squareMileToSquareInch(double val){
        return (val * 4.014e+9);
    }

    private double squareMileToHectare(double val){
        return (val * 3.098e+6);
    }

    private double squareMileToAcre(double val){
        return (val * 3.098e+6);
    }
}
