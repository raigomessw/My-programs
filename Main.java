package com.Hacker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    //• Crie uma classe que descreva um livro.
    //• Crie 3 instâncias da classe (3 livros diferentes).
    //• Crie uma matriz (um campo) que armazena os livros.
    //• Imprima o primeiro livro.
    //• Imprima o último livro.
    //• Organize os livros.
    //• Imprima todos os livros.
    //• Imprimir número de livros.
    //• Adicione um novo livro ao array.

    public static void main(String[] args) {
        
        Boks c1 = new Boks(1,"Kärlik","Råd",150,true);
        Boks c2 = new Boks(2,"äventyr","Råd",100,false);
        Boks c3 = new Boks(3,"Fantasi","Vit",230,true);
        Boks c4 = new Boks(1,"Romance","Vit med Råd", 300, true);

        c1.status();
        c2.status();
        c3.status();
        c4.status();

        //Array bok
        ArrayList<Boks> boks = new ArrayList<Boks>();
        boks.add(c1);
        boks.add(c2);
        boks.add(c3);
        System.out.println("Fösta Bok: " + boks.get(0));
        System.out.println("Sista Bok: " + boks.get(2));
        System.out.println("Plus bok= " + boks);

        Collections.sort(boks);
        System.out.println("Antal Boks: " + boks.size());
        boks.add(c4);
        System.out.println("Nyt antal bok: "+ boks.size());


    }

    }





