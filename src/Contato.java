package org.example;

import java.util.ArrayList;

public class Contato {
    private String nome;
    private String email;
    private ArrayList<String> telefones;

    public Contato(String nome, String email){
        this.nome = nome;
        this.email = email;
        telefones = new ArrayList<>();
    }

    public Contato(){
        telefones = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addTelefone(String telefone) {
        telefones.add(telefone);
    }

    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefones=" + telefones +
                '}';
    }
}