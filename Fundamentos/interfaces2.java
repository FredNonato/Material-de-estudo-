// exemplo de interface com múltiplas implementações
// e uso de polimorfismo para executar diferentes operações matemáticas

import java.util.ArrayList;

interface OperacaoMatematica {
    void executar(int a, int b);
}
class Soma implements OperacaoMatematica {
    @Override
    public void executar(int a, int b) {
        System.out.println("Soma: " + (a + b));
    }
}
class Subtracao implements OperacaoMatematica {
    @Override
    public void executar(int a, int b) {
        System.out.println("Subtração: " + (a - b));
    }
}
class Multiplicacao implements OperacaoMatematica {
    @Override
    public void executar(int a, int b) {
        System.out.println("Multiplicação: " + (a * b));
    }
}
class Divisao implements OperacaoMatematica {
    @Override
    public void executar(int a, int b) {
        if (b != 0) {
            System.out.println("Divisão: " + (a / b));
        } else {
            System.out.println("Erro: Divisão por zero!");
        }
    }
}
public class interfaces2 {
    public static void main(String[] args) {
       ArrayList <OperacaoMatematica> operacoes = new ArrayList<>();
        operacoes.add(new Soma());
        operacoes.add(new Subtracao());
        operacoes.add(new Multiplicacao());
        operacoes.add(new Divisao());
        int a = 10, b = 5;
        for (OperacaoMatematica operacao : operacoes) {
            operacao.executar(a, b);
        }

    }
}
