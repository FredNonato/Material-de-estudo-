import java.util.Random;

public class Conta {
double saldo;
double saldoPoupanca;
Random random = new Random();

public void depositar(double valor){
    this.saldo = saldo + valor;
}
public void sacar(double valor){
    this.saldo = saldo - valor;
}
public void ContaPoupanca(double valor){
    double taxaJuros = random.nextDouble(0, 0.1);
    this.saldoPoupanca = saldoPoupanca + (valor * taxaJuros);
}
public void ContaCorrente(double saldo){
    double ChequeEspecial = +1000;
    this.saldo = saldo + ChequeEspecial;
    if (saldo < 0){
        System.out.println("Saldo negativo, utilize o cheque especial com responsabilidade");
    }
}
public void mostrarSaldo(){
    System.out.println("Saldo: " + this.saldo);
    System.out.println("Saldo Poupança: " + this.saldoPoupanca);
}
}
