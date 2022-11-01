package org.example;

public class Principal {
    public static void main(String[] args) {
        AgendaTelefone a1 = new AgendaTelefone();
        org.example.Contato c1 = new org.example.Contato("Mateus", "eu@eu.com");
        c1.addTelefone("8399112244");
        c1.addTelefone("83988554433");
        a1.addContato(c1);

        org.example.Contato c2 = new org.example.Contato("Camilla","elaela@eu.com");
        a1.addContato(c2);
        System.out.println(a1);
        a1.removeContato(c2);
        System.out.println(a1);
        a1.editarContato(c1,"Thais");
        System.out.println(a1);

    }
}