package com.example.VendedoresReservas.Entities;

public class ParametroNoValido extends Exception{

    public ParametroNoValido(String message) {
        super("ERROR: " + message);
    }

}
