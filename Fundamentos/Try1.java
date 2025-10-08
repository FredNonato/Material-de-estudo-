// exemplo de uso do try/catch em uma tratativa simples de exceção

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga um número inteiro:");
        int num1 = sc.nextInt();
        System.out.println("Diga outro número inteiro:");
        int num2 = sc.nextInt();

        try {
            double div = (double) num1 / num2;
            System.out.printf("Resultado da divisão: %.2f%n", div);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não é permitida.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: entrada inválida. Por favor, insira números inteiros.");
        } finally {
            System.out.println("Operação finalizada.");
        }
        sc.close();
    }
}