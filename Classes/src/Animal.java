public abstract class Animal {

public abstract void emitirSom();
}
class Cachorro extends Animal {
    public void emitirSom() {
        System.out.println("Au Au");
    }}
class Gato extends Animal {
    public void emitirSom() {
        System.out.println("Miau Miau");
    }}
class Pato extends Animal {
    public void emitirSom() {
        System.out.println("Quack Quack");
    }}


