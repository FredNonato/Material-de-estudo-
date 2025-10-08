//agrupamento de pessoas por idade e cidade usando listas e mapas 

import java.util.*;

class Pessoa {
    String nome;
    int idade;
    String cidade;

    Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return nome + " (" + idade + " anos)";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", 23, "São Paulo"));
        pessoas.add(new Pessoa("Bruno", 30, "Rio de Janeiro"));
        pessoas.add(new Pessoa("Carla", 19, "Belo Horizonte"));
        pessoas.add(new Pessoa("Daniel", 25, "Curitiba"));
        pessoas.add(new Pessoa("Eva", 22, "Porto Alegre"));

        // Ordenar por idade
        Collections.sort(pessoas, Comparator.comparingInt(p -> p.idade));

        System.out.println("Pessoas ordenadas por idade:");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }

    Map<String, List<Pessoa>> nomePorCidade = new HashMap<>();
        for (Pessoa p : pessoas) {
            nomePorCidade.putIfAbsent(p.cidade, new ArrayList<>());
            nomePorCidade.get(p.cidade).add(p);
        }
        System.out.println("\nPessoas agrupadas por cidade:");
        for (String cidade : nomePorCidade.keySet()) {
            System.out.println(cidade + ": " + nomePorCidade.get(cidade));
        }

    }
}