public class Pessoa{
    String nome;
    private int idade;
public Pessoa(String nome, int idadeInicial){
    this.nome = nome;
    setIdade(idadeInicial);
}
public int getIdade(){
    return this.idade;
}
private void setIdade(int idadeInicial) {
    if(idadeInicial >= 0 && idadeInicial <= 120){
        this.idade = idadeInicial;
    } else {
        System.out.println("Idade inválida");
    }}
}