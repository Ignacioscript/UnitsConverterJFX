package com.example.conversordeunidades.models;

import java.io.IOException;
import java.util.Map;

public  class UnitConverterExchange extends UnitConverter {



    public enum ExchangeUnits {
        COP,
        EUR,
        GBP,
        JPY,
        KRW,
        USD


    }





    public static double convert(double value, ExchangeUnits from, ExchangeUnits to) {
        if (from == to) {
            return value;
        }

        // Convertir a PESOS
        switch (from) {
            case USD:
                value *= 4848.75;
                break;
            case EUR:
                value *= 5129.40;
                break;
            case KRW:
                value *= 3.70;
                break;
            case GBP:
                value *= 5847.13;
                break;
            case JPY:
                value *= 36.39;
                break;
            default:
                break;
        }

        // Convertir a la unidad objetivo
        switch (to) {
            case USD:
                value /= 4848.75;
                break;
            case EUR:
                value /= 5129.40;
                break;
            case KRW:
                value /= 3.70;
                break;
            case GBP:
                value /= 5847.13;
                break;
            case JPY:
                value /= 36.39;
                break;
            default:
                break;
        }

        return value;



    }}




