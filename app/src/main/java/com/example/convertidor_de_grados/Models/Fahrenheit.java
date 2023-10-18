package com.example.convertidor_de_grados.Models;

public class Fahrenheit extends Grados{

    public Fahrenheit(Double valor) {
        this.setValor(valor);
        this.setUnidad("F");
    }

    public Fahrenheit parse(Celsius C){
        double valor = C.getValor()  * 9/5 + 32;
        return new Fahrenheit(valor);
    }

    public Fahrenheit parse(Kelvin K){
        double valor = K.getValor()  * 9/5 - 459.67;
        return new Fahrenheit(valor);
    }
}
