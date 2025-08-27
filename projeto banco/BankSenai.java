import java.util.ArrayList;
import java.util.List;

public class BankSenai{
    private List<Cliente> listaClientes = new ArrayList<>();

public void criarCliente(){
    Cliente novo = new Cliente();
    novo.cadastro();
    novo.definirsenha();
    novo.gerarNConta(10);
    novo.exibirDados();
    listaClientes.add(novo);
    novo.salvarEmArquivo();
    System.out.println("cliente cadastrado com sucesso");}



}
