// Exemplo de uso de interfaces em Java
// Definindo a interface Animal com métodos emitirSom e mover
// Implementando a interface em classes Cachorro e Passaro
// Demonstrando polimorfismo ao chamar os métodos das classes através da interface

import java.util.ArrayList;

interface Animal {
    void emitirSom();
    void mover(); 
}
class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late");
    }
    @Override
    public void mover() {
        System.out.println("O cachorro corre");
    }
}
class Passaro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("O pássaro canta");
    }
    @Override
    public void mover() {
        System.out.println("O pássaro voa");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Passaro());
        for (Animal animal : animais) {
            animal.emitirSom();
            animal.mover();
        }
    }
}
