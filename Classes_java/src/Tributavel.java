public interface Tributavel {
    double calcularImposto();
}
class Produtos implements Tributavel {
    private String nome;
    private double preco;

    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double calcularImposto() {
        return preco * 0.1; // 10% de imposto
    }
}
class Servicos implements Tributavel {
    private String descricao;
    private double valor;

    public Servicos(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public double calcularImposto() {
        return valor * 0.15; // 15% de imposto
    }
}
