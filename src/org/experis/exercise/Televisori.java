package org.experis.exercise;

public class Televisori extends Prodotto {
    private String dimensioni;
    private boolean smart;

    public Televisori(int codice, String nome, String marca, double prezzo, double iva, String dimensioni, boolean smart) {
        super(codice, nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
        System.out.println(dimensioni);
    }

    public String getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(String dimensioni) {
        this.dimensioni = dimensioni;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
    @Override
    public String getDettagliProdottoFormattati() {
        String tipo = "Televisori";
        return String.format("Tipo di Prodotto: %s\n", tipo) +
                super.getDettagliProdottoFormattati() +
                String.format("\nColore: %s\nTipo di connessione wireless: %s", dimensioni, smart);
    }
}
