public class Produto {
    String nome;
    double preco;
    int quantidadeEmEstoque = 0;

public Produto(String nome, double precoInicial){
    this.nome = nome;
    setPreco(precoInicial);
    quantidadeEmEstoque ++;
}
public void setPreco(double precoInicial){
    if (precoInicial < 0){
        System.out.println("Preço inválido");
    }
    else if (precoInicial != 0-9){
        System.out.println("Preço inválido");
    }
    else {
        this.preco = precoInicial;
    }
}
}
