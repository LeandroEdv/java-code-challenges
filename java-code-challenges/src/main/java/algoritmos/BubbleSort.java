package algoritmos;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] vector = {3, 6, 1, 8, 4, 62, 12, 7, 5};
        int aux;
        boolean control;

        for (int i = 0; i < vector.length; i++) {
            control = true;
            for (int j = 0; j < vector.length - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                    control = false;
                }
            }
            if (control) break;
        }

        System.out.println(Arrays.toString(vector));

    }
}
