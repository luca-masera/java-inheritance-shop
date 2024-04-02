package org.experis.exercise;

public class Smartphone extends Prodotto {
    private String imei;
    private int memoria;

    //COSTRUTTORE
    public Smartphone(int codice, String nome, String marca, double prezzo, double iva, String imei, int memoria){
        super(codice, nome, marca, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
    }

    //GETTER E SETTER

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
}
