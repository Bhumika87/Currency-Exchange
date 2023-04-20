package com.CurrenceExchange.Service;

import org.springframework.stereotype.Service;

@Service
public class CurrencyService {

    // dollar coversion
    //rupee
    public double dCR(double USD)
    {
        return USD* 82.2842 ;

    }
    //dollar to euro
    public double dtE(double USD)
    {
        return USD * 0.912825;
    }
    //gbpp
    public double dtGBP(double USD)
    {
        return USD * 0.804325;
    }
    //canadian
    public double dtCan(double USD)
    {
        return USD * 1.34621;
    }
    //rupee conversion
    //dollar
    public double rToD(double INR)
    {
        double dollar = INR * 0.0121530;
        return dollar;
    }
    public double rToE(double INR)
    {
        return INR * 0.0110927;
    }
    public double rToGBP(double INR)
    {
        return INR * 0.00977455;
    }
    public double rToCAD(double INR)
    {
        return INR * 0.0163613;

    }

    //euro conversion
    //dollar
    public double eToD(double euro)
    {
        return  euro * 1.09550;
    }
    public double eToGBP(double euro)
    {
        return  euro * 0.881148;
    }
    public double eToCad(double euro)
    {
        return  euro * 1.47508 ;
    }
    public double eToInr(double euro)
    {
        return  euro * 90.1491;
    }


//canadian conversion
    //dollar
    public double CantoD(double CAD)
    {
        return CAD * 0.742827 ;
    }
    //euro
    public double CantoE(double CAD)
    {
        return CAD * 0.677928;
    }
    public double CantoGBP(double CAD)
    {
        return CAD * 0.597391;
    }
    public double CantoI(double CAD)
    {
        return CAD * 61.1197;
    }
    //gbp conversion
    //usd
    public double gbptoUSD(double GBP)
    {
        return GBP * 1.24328;
    }
    public double gbptoE(double GBP)
    {
        return GBP * 1.13488;
    }
    public double gbptoC(double GBP)
    {
        return GBP * 1.67395;
    }
    public double gbptoI(double GBP)
    {
        return GBP * 102.308;
    }



}
