package com.CurrenceExchange.Controller;

import com.CurrenceExchange.Enti.Cur;
import com.CurrenceExchange.Enti.Singl;
import com.CurrenceExchange.Service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class Currencyy {
    @Autowired
    private CurrencyService currencyService;
    @RequestMapping(value = "/converter",method = RequestMethod.GET)
    public ModelAndView index(Model model)
    {
        List<String> li = Arrays.asList("Select","USD","INR","GBP","CAD","EUR");
        Cur cur=new Cur();
        cur.setFromCurrency(li);
        cur.setToCurrency(li);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("res",cur);
        modelAndView.setViewName("updating");

        return modelAndView;

    }
    @PostMapping("/processForm")

     public String proc(@ModelAttribute Singl singl,Model model)
    {
        //getting value from page
        String fr = singl.getFrom();
        String too = singl.getTo();
        double amo= singl.getAmount();

        //  for USD
        if(fr.equals("USD") && too.equals("INR"))
        {
            double calculatedAmount= currencyService.dCR(amo);
            model.addAttribute("display",calculatedAmount);
        }
        else if(fr.equals("USD") && too.equals("GBP"))
        {
            double calculatedAmount= currencyService.dtGBP(amo);
            model.addAttribute("display",calculatedAmount);
        }
        else if(fr.equals("USD") && too.equals("CAD"))
        {
            double calculatedAmount= currencyService.dtCan(amo);
            model.addAttribute("display",calculatedAmount);
        }
        else if(fr.equals("USD") && too.equals("EUR"))
        {
            double calculatedAmount= currencyService.dtE(amo);
            model.addAttribute("display",calculatedAmount);
        }
//for india currency
        else if(fr.equals("INR") && too.equals("USD"))
       {
        double calculatedAmount= currencyService.rToD(amo);
        model.addAttribute("display",calculatedAmount);
        }
        else if(fr.equals("INR") && too.equals("GBP"))
        {
            double calculatedAmount= currencyService.rToGBP(amo);
            model.addAttribute("display",calculatedAmount);
        }
        else if(fr.equals("INR") && too.equals("CAD"))
        {
            double calculatedAmount= currencyService.rToCAD(amo);
            model.addAttribute("display",calculatedAmount);
        }
        else if(fr.equals("INR") && too.equals("EUR"))
        {
            double calculatedAmount= currencyService.rToE(amo);
            model.addAttribute("display",calculatedAmount);
        }
        //GBP
        else if(fr.equals("GBP") && too.equals("USD"))
        {
            double calculatedAmount= currencyService.gbptoUSD(amo);
            model.addAttribute("display",calculatedAmount);
        }
        else if(fr.equals("GBP") && too.equals("CAD"))
        {
            double calculatedAmount= currencyService.gbptoC(amo);
            model.addAttribute("display",calculatedAmount);
        }
        else if(fr.equals("GBP") && too.equals("INR"))
        {
            double calculatedAmount= currencyService.gbptoI(amo);
            model.addAttribute("display",calculatedAmount);
        }
        else if(fr.equals("GBP") && too.equals("EUR"))
        {
            double calculatedAmount= currencyService.gbptoE(amo);
            model.addAttribute("display",calculatedAmount);
        }

        //EUR
        else if(fr.equals("EUR") && too.equals("USD"))
        {
            double calculatedAmount= currencyService.eToD(amo);
            model.addAttribute("display",calculatedAmount);
        }
        else if(fr.equals("EUR") && too.equals("CAD"))
        {
            double calculatedAmount= currencyService.eToCad(amo);
            model.addAttribute("display",calculatedAmount);
        }
        else if(fr.equals("EUR") && too.equals("INR"))
        {
            double calculatedAmount= currencyService.eToInr(amo);
            model.addAttribute("display",calculatedAmount);
        }
        else if(fr.equals("EUR") && too.equals("GBP"))
        {
            double calculatedAmount= currencyService.eToGBP(amo);
            model.addAttribute("display",calculatedAmount);
        }

        //CAD
        else if(fr.equals("CAD") && too.equals("GBP"))
        {
            double calculatedAmount= currencyService.CantoGBP(amo);
            model.addAttribute("display",calculatedAmount);
        }
        else if(fr.equals("CAD") && too.equals("USD"))
        {
            double calculatedAmount= currencyService.CantoD(amo);
            model.addAttribute("display",calculatedAmount);
        }
        else if(fr.equals("CAD") && too.equals("EUR"))
        {
            double calculatedAmount= currencyService.CantoE(amo);
            model.addAttribute("display",calculatedAmount);
        }
        else if(fr.equals("CAD") && too.equals("INR"))
        {
            double calculatedAmount= currencyService.CantoI(amo);
            model.addAttribute("display",calculatedAmount);
        }

        //selected item is same
        else{
            model.addAttribute("display",amo);
        }

        //page return

        return "dat";
    }
    @RequestMapping("/About")
    public String abo()
    {
        return "About";
    }



}
