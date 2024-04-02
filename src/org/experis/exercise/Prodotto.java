package org.experis.exercise;

import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {

    //ATTRIBUTI
    private int codice;
    private  String nome;
    private String marca;
    private double prezzo;
    private double iva;

    //COSTRUTTORI


    public Prodotto(int codice, String nome, String marca, double prezzo, double iva) {
        this.codice = codice;
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // GETTER
    public int getCodice() {
        return codice;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getIva() {
        return iva;
    }

    //SETTER
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double priceSenzaIva(){

        return prezzo;
    }
    public double priceIva(){

        return prezzo * (1 + iva / 100);
    }
    public String getDettagliProdottoFormattati() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Codice: " + codice +
                "\nNome: " + nome +
                "\nMarca: " + marca +
                "\nPrezzo: " + df.format(priceSenzaIva()) +
                "\nIVA: " + df.format(iva) + "%" +
                "\nPrezzo con IVA: " + df.format(priceIva());
    }




}