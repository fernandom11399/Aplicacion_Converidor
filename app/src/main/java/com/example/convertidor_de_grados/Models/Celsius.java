package com.example.convertidor_de_grados.Models;

public class Celsius extends Grados{

    public Celsius(Double valor) {
        this.setValor(valor);
        this.setUnidad("C");
    }

    public Celsius parse(Fahrenheit F){
        double valor = (F.getValor()- 32) * 5/9;
        return new Celsius(valor);
    }

    public Celsius parse(Kelvin K){
        double valor = K.getValor()  - 273.15;
        return new Celsius(valor);
    }
}
