public class Banco {
    String numeroConta;
    double saldo;
public void depositar(double valor, String numeroConta){
    this.numeroConta = numeroConta;

    this.saldo = saldo + valor;
    }
public void sacar(double valor, String numeroConta){
    this.numeroConta = numeroConta;
    this.saldo = saldo - valor;
    }
public void mostrarSaldo(String numeroConta){
    this.numeroConta = numeroConta;
    System.out.println("Conta: " + this.numeroConta + " Saldo: " + this.saldo);
    }
}
