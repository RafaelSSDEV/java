package uninter;

import java.util.ArrayList;
import java.util.List;

class Cofrinho {
    List<Moeda> listaMoedas;

    public Cofrinho() {
        listaMoedas = new ArrayList<>();
    }

    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
        System.out.println("Moeda adicionada ao cofrinho.");
    }

    public void remover(Moeda moeda) {
        if (listaMoedas.remove(moeda)) {
            System.out.println("Moeda removida do cofrinho.");
        } else {
            System.out.println("A moeda não está presente no cofrinho.");
        }
    }

    public void listagemMoedas() {
        if (listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
        } else {
            System.out.println("Moedas no cofrinho:");
            for (Moeda moeda : listaMoedas) {
                moeda.info();
            }
        }
    }

    public double totalConvertido() {
        double total = 0.0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converterParaReal();
        }
        return total;
    }
}