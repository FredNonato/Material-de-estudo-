import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Cliente{
private Random rand = new Random();
private String nome;
private String senha;
private String cpf;
private String Nconta;
private String sobrenome;
private String ultimoN;
Scanner sc = new Scanner(System.in);

public void gerarNConta(int limite){
    String gerada = "";
    Random ra = new Random();
    for(int i=0;i<limite;i++){
        gerada += ra.nextInt(5);;}
    this.Nconta = gerada;}

public void cadastro(){
    String cpfD = "";
    do {System.out.println("Digite seu CPF (11 dígitos, sem pontos ou traços): ");
        cpfD = sc.nextLine();
        if (cpfD.length() != 11 || !cpfD.matches("\\d{11}")) {System.out.println("Valor inválido. Tente novamente.");
        } else {this.cpf = cpfD;
            break;}
    } while (true);
    sc.nextLine();
    String nomeD = "";
    do {System.out.println("digite seu nome: ");
        nomeD = sc.nextLine();
        if (nomeD.matches("\\^a-zA-Z")){this.nome = nomeD;}while(true);}
    System.out.println("digite seu sobrenome: ");
    this.sobrenome = sc.nextLine();
    System.out.println("digite seu ultimo nome: ");
    this.ultimoN = sc.nextLine();}

public void definirsenha(){
    System.out.println("digite uma senha de 6 digitos: ");
    String senhaDigitada = sc.nextLine();
    if (senhaDigitada.length()!=6){System.out.println("valor invalido");}
    else this.senha = senhaDigitada;System.out.println("senha cadastrada com sucesso");}

public void exibirDados(){
    System.out.println("Nome: "+nome + sobrenome + ultimoN);
    System.out.println("CPF: "+cpf);
    System.out.println("Conta: "+Nconta);}

public void salvarEmArquivo(){
    String caminho = "C:\\Users\\Fred\\Documents\\Java.clientes.txt";
    try {BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Fred\\Documents\\Java.clientes.txt", true));
        bw.write("Nome: " + nome + " " + sobrenome + " " + ultimoN+";");
        bw.newLine();
        bw.write("CPF: " + cpf+";");
        bw.newLine();
        bw.write("Conta: " + Nconta+";");
        bw.newLine();
        bw.write("Senha: " + senha+";");
        bw.newLine();
        bw.write("------------------------");
        bw.newLine();
        bw.close();
        BufferedReader leitor = new BufferedReader(new FileReader("C:\\Users\\Fred\\Documents\\Java.clientes.txt"));
        String linha;
        while ((linha = leitor.readLine()) != null) {System.out.println(linha);}
        leitor.close();
    } catch (IOException e) {System.out.println("Erro ao salvar cliente: " + e.getMessage());}
}

}