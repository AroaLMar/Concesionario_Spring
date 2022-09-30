package com.example.VendedoresReservas.Entities;

public class DatoNoValido extends Exception{

    public DatoNoValido(String message) {
        super("ERROR: " + message);
    }

}
