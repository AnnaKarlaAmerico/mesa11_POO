package Aula11_Mesa;

public class Preguica extends Animal{
    public Preguica (String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Yawn");
    }

    public void subirArvore() {
        System.out.println("Subindo");
    }
}


