package algoritmos;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            // Particiona o array e obtém o índice do pivô
            int indicePivo = particionar(array, inicio, fim);

            // Ordena a sublista à esquerda do pivô
            quickSort(array, inicio, indicePivo - 1);

            // Ordena a sublista à direita do pivô
            quickSort(array, indicePivo + 1, fim);
        }
    }

    // Função de particionamento
    private static int particionar(int[] array, int inicio, int fim) {
        int pivo = array[fim]; // Escolhe o último elemento como pivô
        int i = inicio - 1; // Índice do menor elemento

        for (int j = inicio; j < fim; j++) {
            // Se o elemento atual for menor ou igual ao pivô
            if (array[j] <= pivo) {
                i++;
                // Troca array[i] com array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Coloca o pivô na posição correta
        int temp = array[i + 1];
        array[i + 1] = array[fim];
        array[fim] = temp;

        return i + 1; // Retorna o índice do pivô
    }

    // Função para imprimir o array
    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        System.out.println("Array original:");
        imprimirArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("Array ordenado:");
        imprimirArray(array);
    }
}
