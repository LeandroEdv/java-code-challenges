package test;

public class Fibonacci {

    public static int fibo(int n){
        if (n == 1){
            return 0;
        } else if(n == 2){
            return 1;
        }
        return fibo(n -1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
}
