package com.Hacker;


public class Boks implements Comparable {
    int kode;
    String tema;
    String färg;
    int sidor;
    boolean stäng;


    void status() {
        System.out.println("Boken: " + this.kode);
        System.out.println("Tema: " + this.tema);
        System.out.println("Färg:" + this.färg);
        System.out.println("Antal sidor: " + this.sidor);
        System.out.println("Det är öppet? " + this.stäng);
    }

    void open() {
        stäng = false;

    }

    public Boks(int bok, String tema, String färg, int sidor, boolean stäng) {
        this.kode = bok;
        this.tema = tema;
        this.färg = färg;
        this.sidor = sidor;
        this.stäng = stäng;
    }

    @Override
    public int compareTo(Object comparestu) {
        int compareage = ((Boks) comparestu).kode;
        /* For Ascending order*/
        return this.kode - compareage;

        /* For Descending order do like this */
        //return compareage-this.studentage;
    }


}






