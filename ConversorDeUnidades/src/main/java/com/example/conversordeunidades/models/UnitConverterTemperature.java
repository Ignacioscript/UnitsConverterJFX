package com.example.conversordeunidades.models;

public  class UnitConverterTemperature extends UnitConverter {



    public enum TempetureUnits {
        CENTIGRADOS,
        KELVIN,
        FARENHEIT,


    }




    public static double convert(double value, TempetureUnits from, TempetureUnits to) {
        double result = 0;
        if (from == to) {
            return value;
        }

        // Convertir a Centigrados
        switch (from) {
            case FARENHEIT:
                result = (value - 32) * 5/9;
                value = result;
                break;
            case KELVIN:
                result = value - 273.15;
                value = result;
                break;
            default:
                break;
        }

        // Convertir a la unidad objetivo
        switch (to) {
            case FARENHEIT:
                result = (value * 9/5) + 32;
                value = result;
                break;
            case KELVIN:
                result = value + 273.15;
                value = result;
                break;
            default:
                break;
        }

        return value;
    }
}
