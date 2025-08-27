import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BankSenai banco = new BankSenai();
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar novo cliente");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    banco.criarCliente();
                    break;
                case 2:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 2);
    }
}