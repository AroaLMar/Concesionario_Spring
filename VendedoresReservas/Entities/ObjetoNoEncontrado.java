package com.example.VendedoresReservas.Entities;

public class ObjetoNoEncontrado extends Exception {

     public ObjetoNoEncontrado(String message) {
          super("ERROR " + message);
     }

}
