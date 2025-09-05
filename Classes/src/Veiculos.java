import java.util.Scanner;
public abstract class Veiculos {
Scanner sc = new Scanner(System.in);
public abstract void calcularImposto();
}
class Carro extends Veiculos {
    public void calcularImposto() {
        double imposto = 0.3;
        System.out.println("Qual o valor do carro?");
        double valorCarro = sc.nextDouble();
        if (valorCarro > 80000){
            double valorImposto = valorCarro * imposto;
            System.out.println("O valor do imposto é: " + valorImposto);
        } else {
            System.out.println("O carro está isento de imposto");
        }
    }
}
class Moto extends Veiculos {
    public void calcularImposto() {
        double imposto = 0.1;
        System.out.println("Qual o valor da moto?");
        double valorMoto = sc.nextDouble();
        if (valorMoto > 30000){
            double valorImposto = valorMoto * imposto;
            System.out.println("O valor do imposto é: " + valorImposto);
        } else {
            System.out.println("A moto está isento de imposto");
        }
    }
}

