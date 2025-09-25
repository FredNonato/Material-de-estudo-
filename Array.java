// exemplo de array com loop infinito até o usuário digitar sair

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();
    String nome = "";
while (!nome.equals("sair")) {
    System.out.println("Digite um nome para adicionar na lista ou 'sair' para encerrar:");
    nome = sc.nextLine();
    list.add(nome);}
    list.remove("sair");
    System.out.println("Lista de nomes:" + list);     
    }
}