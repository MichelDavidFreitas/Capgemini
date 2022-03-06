/* A mediana de uma lista de números é basicamente o elemento que se encontra no meio da lista após a ordenação. Dada uma lista de números com um número ímpar de elementos, desenvolva um algoritmo que encontre a mediana. */
//arr = [9,2,1,4,6]

public class Desafio01 {
	public static void main(String[] args) {
        //Lista de números
        int[] arr = {9,2,1,4,6};
        //Ordenação
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]){
                    int aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
        //Encontra a mediana
        int mediana = 0;
        if (arr.length % 2 == 0) {
            mediana = (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2;
        } else {
            mediana = arr[arr.length / 2];
        }
        System.out.println(mediana);
	}
}