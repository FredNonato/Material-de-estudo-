// uso do try para lidar com acesso simples a valores de arraylist com tratamento de exceção

import java.util.ArrayList;
import java.util.Scanner;

public class try2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList list = new ArrayList();
    list.add("banana");
    list.add("maçã");
    list.add("laranja");
    list.add("uva");
    list.add("pera");
    System.out.println("Diga um índice: ");
    int index = sc.nextInt();
    try {
        System.out.println("O elemento no índice " + index + " é: " + list.get(index));
    } catch (IndexOutOfBoundsException e) {
        System.out.println("Índice inválido! Por favor, insira um índice entre 0 e " + (list.size() - 1) + ".");
    }
    finally {
        System.out.println("Programa encerrado.");
        sc.close();
    }
}
}
