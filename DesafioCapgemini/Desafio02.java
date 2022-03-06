/* Dado um vetor de inteiros n e um inteiro qualquer x. Construa um algoritmo que determine o número de elementos pares do vetor que tem uma diferença igual ao valor de x. */
public class Desafio02 {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        int x = 2;
        int counter = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] + x == n[j]) {
                    counter++;
                }
            }
        }
        System.out.println("Existem " + counter + " pares de inteiros no vetor com uma diferença de " + x + ": ");
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] + x == n[j]) {
                    System.out.println("[" + n[i] + ", " + n[j] + "]");
                }
            }
        }
    }
}
