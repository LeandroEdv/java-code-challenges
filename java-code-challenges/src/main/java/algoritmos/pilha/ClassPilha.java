package algoritmos.pilha;

public class ClassPilha {

    private int[] vetor;
    private int topo;
    private int tamanho;

    public ClassPilha(int tamanho) {
        this.vetor = new int[tamanho];
        this.topo = -1;
        this.tamanho = tamanho;
    }

    public boolean pilhaVazia() {
        return topo == -1;
    }

    public boolean pilhaCheia() {

        return topo >= tamanho - 1;
    }

    public void empilhar(int elemento) {
        if (!pilhaCheia()) {
            topo += 1;
            vetor[topo] = elemento;
        } else {
            System.out.println("pilha cheia: ");
        }
    }

    public int desempilhar() {
        int desempilhado = 0;
        if (!pilhaVazia()) {
            desempilhado = vetor[topo];
            topo--;
            return desempilhado;
        } else {
            System.out.println("pilha vazia");
            return 0;
        }
    }

    public void elementoTopo() {
        if (topo >= 0) {
            System.out.println("elemento topo é: " + vetor[topo]);

        } else System.out.println("pilha vazia");
    }

    public void mostrarPilha() {
        for (int i = vetor.length - 1; i >= 0; i--
        ) {
            System.out.println(i + " " + vetor[i]);
        }
    }

}
