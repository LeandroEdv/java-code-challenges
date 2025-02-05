package test;

public class Test {
    public static void main(String[] args) {
        int base = 8;
        int altura = base;
        int[][] triangulo = new int[base][altura];

        for (int h = 0; h < altura; h++) {

            for (int b = 0; b < base; b++) {
                System.out.print("*");
            }
            base -= 1;
            System.out.println();
        }
    }
}
