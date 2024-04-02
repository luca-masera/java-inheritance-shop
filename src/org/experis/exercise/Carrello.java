package org.experis.exercise;


    public class Main {
        public static void main(String[] args) {
            Prodotto prodotto1 = new Prodotto("Macchina","Mini cooper", 14000, 22);
            Prodotto prodotto2 = new Prodotto("Tazza","Tazza orientale di marmo", 150,22);

            //STAMPO prodotto1
            System.out.println("Il mio primo prodotto è una:" + prodotto1.nomeEsteso());
            System.out.println("Il modello del prodotto è:" + " " + prodotto1.marca);
            System.out.println("Il prezzo base senza Iva è:" + prodotto1.price() + "$");
            System.out.println("Il prezzo con Iva è:" + prodotto1.priceIva() + "$");

            System.out.println();

            //STAMPO prodotto2
            System.out.println("Il mio secondo prodotto è una:" + prodotto2.nomeEsteso());
            System.out.println("Il modello del prodotto è:" + " " + prodotto2.marca);
            System.out.println("Il prezzo base senza Iva è:" + prodotto2.price() + "$");
            System.out.println("Il prezzo con Iva è:" + prodotto2.priceIva() + "$");
        }
    }

