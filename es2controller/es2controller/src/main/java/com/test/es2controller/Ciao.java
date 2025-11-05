package com.test.es2controller;

public class Ciao {

    public String nome;
    public String provincia;
    public String saluto ;

    public Ciao(String nome, String provincia){
        this.nome = nome;
        this.provincia = provincia;
        saluto = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }

}
