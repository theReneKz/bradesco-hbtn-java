import java.util.Scanner;


public class ArrayExercicio {


    public static void main(String[] args) {
        // Criando o scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);


        // Definindo o tamanho do array
        int tamanhoArray = 10;
        int[] numeros = new int[tamanhoArray];
        int soma = 0;
        int maiorNumero = Integer.MIN_VALUE;


        // Preenchendo o array com números fornecidos pelo usuário
        // Utilize scanner.nextInt(); para receber o numero digitado
        System.out.println("Digite 10 números inteiros:");
        for(int i = 0; i < tamanhoArray; i++) {
            System.out.print(String.format("Digite o número %d: ", (i + 1)));
            numeros[i] = scanner.nextInt();
        }
        System.out.println("\n\nConteúdo do array:");
        for(int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
            if(numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
            System.out.print("" + numeros[i] + " ");
        }
        // Exibindo os resultados
        System.out.println(String.format("Soma de todos os números: %d", soma));
         System.out.println(String.format("Maior número no array: %d", maiorNumero));

        // Fechando o scanner
        scanner.close();
    }
}
