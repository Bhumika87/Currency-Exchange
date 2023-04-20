package com.CurrenceExchange.Enti;

import java.util.List;

public class Cur {

    List<String> fromCurrency;
    List<String> toCurrency;

    public List<String> getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(List<String> fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public List<String> getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(List<String> toCurrency) {
        this.toCurrency = toCurrency;
    }

    public Cur() {
    }

    public Cur(List<String> fromCurrency, List<String> toCurrency) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }
}
