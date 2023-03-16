package com.example.conversordeunidades.models;

import com.example.conversordeunidades.models.UnitConverter;

public  class UnitConverterLength extends UnitConverter {

    public enum LengthUnits {
        METER,
        KILOMETER,
        MILE,


    }




    public static double convert(double value, LengthUnits from, LengthUnits to) {
        if (from == to) {
            return value;
        }

        // Convertir a metros
        switch (from) {
            case KILOMETER:
                value *= 1000;
                break;
            case MILE:
                value *= 1609.34;
                break;
            default:
                break;
        }

        // Convertir a la unidad objetivo
        switch (to) {
            case KILOMETER:
                value /= 1000;
                break;
            case MILE:
                value /= 1609.34;
                break;
            default:
                break;
        }

        return value;
    }
}
