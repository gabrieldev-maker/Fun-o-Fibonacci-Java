import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Números de termos:");
        int termos = scanner.nextInt();
        // quantos termos tu quer, cabra
        imprimirFibonacci(BigInteger.ONE, BigInteger.ONE, termos);
        scanner.close();
    }

    // Função recursiva pra imprimir a sequência
    public static void imprimirFibonacci(BigInteger a, BigInteger b, int termosRestantes) {

        if (termosRestantes <= 0) {
            return; // caso base: acabou
        }

        System.out.println(a); // imprime o atual

        // próxima chamada recursiva
        imprimirFibonacci(b, a.add(b), termosRestantes - 1);
    }
}
