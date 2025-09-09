public class Usuario {
    String nome;
    private String senha;

public Usuario(String nome, String senhaInicial){
    this.nome = nome;
    setSenha(senhaInicial);
}
public String getSenha(){
    return this.senha;
}
private void setSenha(String senhaInicial){
    if(senhaInicial.length() >= 6 && Character.isUpperCase(senhaInicial.charAt(0))){
        this.senha = senhaInicial;
    }
}
}
