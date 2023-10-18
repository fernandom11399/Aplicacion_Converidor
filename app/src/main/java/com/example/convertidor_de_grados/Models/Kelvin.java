package com.example.convertidor_de_grados.Models;

public class Kelvin extends Grados{
    public Kelvin(Double valor) {
        this.setValor(valor);
        this.setUnidad("K");
    }

    public Kelvin parse(Celsius C){
        double valor = C.getValor() + 273.15;
        return new Kelvin(valor);
    }
    public Kelvin parse(Fahrenheit F){
        double valor = (F.getValor()  + 459.67) * 5/9;
        return new Kelvin(valor);
    }



}
