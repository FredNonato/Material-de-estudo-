import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class Conta {
    public void lerArquivo(String caminho) {
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                String nome = partes[0];
                String cpf = partes[1];
                String numeroConta = partes[2];

                System.out.println("Nome: " + nome);
                System.out.println("CPF: " + cpf);
                System.out.println("Conta: " + numeroConta);
                System.out.println("-----------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

