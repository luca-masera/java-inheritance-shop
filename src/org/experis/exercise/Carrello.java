package org.experis.exercise;


import java.util.ArrayList;
import java.util.Scanner;

public class Carrello {
        public static void main(String[] args) {
            ArrayList<Prodotto> carrello = new ArrayList<>();

            Scanner scan = new Scanner(System.in);

            System.out.println("Che tipo di prodotto preferisce? Smartphone, Televisore o Cuffie?");
            String tipo = scan.nextLine();

            System.out.println("Inserisci il codice: ");
            int codice = Integer.parseInt(scan.nextLine());

            System.out.println("Inserisci il nome: ");
            String nome = scan.nextLine();

            System.out.println("Inserisci la marca: ");
            String marca = scan.nextLine();

            System.out.println("Inserisci il prezzo: ");
            double prezzo = Double.parseDouble(scan.nextLine());

            System.out.println("Inserisci l'IVA: ");
            double iva = Double.parseDouble(scan.nextLine());

            //aggiunta prodotti al carrello con relative validazioni
            if (tipo.equals("Smartphone")){
                System.out.println("Inserisci il codice IMEI:");
                String imei = scan.nextLine();
                System.out.println("Inserisci la quantità di memoria che preferisci:");
                int memoria = Integer.parseInt(scan.nextLine());
                carrello.add(new Smartphone(codice, nome, marca, prezzo, iva, imei, memoria));
            } else if (tipo.equals("Televisore")){
                System.out.println("Di che dimensioni vuoi il televisore?");
                String dimensioni = scan.nextLine();
                System.out.println("Lo vuoi smart oppure no?:");
                boolean smart = Boolean.parseBoolean(scan.nextLine());
                carrello.add(new Televisori(codice, nome, marca, prezzo, iva, dimensioni, smart));
            }else if (tipo.equals("Cuffie")){
                System.out.println("Di che colore vuoi le cuffie?");
                String colore = scan.nextLine();
                System.out.println("Le vuoi wireless oppure no?:");
                boolean wireless = Boolean.parseBoolean(scan.nextLine());
                carrello.add(new Cuffie(codice, nome, marca, prezzo, iva, colore, wireless));
            }
            System.out.println("Carrello:");
            for (Prodotto prodotto : carrello){
                System.out.println(prodotto.getDettagliProdottoFormattati());
            }

        }
    }

