package org.example;

import java.util.ArrayList;

public class AgendaTelefone {
    private ArrayList<org.example.Contato> contatos;

    public AgendaTelefone(){
        contatos = new ArrayList<>();
    }

    public int procuraContato(org.example.Contato contato){
        return contatos.indexOf(contato);
    }
    public void addContato(org.example.Contato contato){
        if (procuraContato(contato) == -1){
            contatos.add(contato);
        }else{ //ele já está cadastrado
            System.out.println("Este contato já existe");
        }
    }
    public void removeContato(org.example.Contato contato){
        if (procuraContato(contato) == -1){
            System.out.println("Este contato não existe");
        }else{ //se ele existe
            contatos.remove(contato);
        }
    }
    public void editarContato(org.example.Contato contato, String novoNome){
        int indice = procuraContato(contato);
        if (indice == -1){
            System.out.println("Este contato não existe");
        }else{ //se ele existe
            contatos.get(indice).setNome(novoNome);
        }
    }

    public String toString() {
        return "AgendaTelefone{" +
                "contatos=" + contatos +
                '}';
    }
}