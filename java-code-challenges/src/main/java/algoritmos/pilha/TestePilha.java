package algoritmos.pilha;

public class TestePilha {
    public static void main(String[] args) {
        ClassPilha pilha = new ClassPilha(5);
        pilha.mostrarPilha();
        System.out.println( "-----");
        pilha.empilhar(7);
        pilha.empilhar(3);
        pilha.empilhar(6);
        pilha.empilhar(6);
        pilha.empilhar(6);
        pilha.empilhar(6);

        pilha.mostrarPilha();
        System.out.println(pilha.pilhaCheia());
    }
}
