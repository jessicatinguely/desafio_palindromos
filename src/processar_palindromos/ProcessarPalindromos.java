package processar_palindromos;

import java.text.Normalizer;
import java.util.Scanner;

public class ProcessarPalindromos {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {

            System.out.println("Digite uma palavra ou frase: ");
            String palavra = leia.nextLine();

            // Normalizar: tirar acentos, espaços e pontuações, e deixar minúscula
            palavra = Normalizer.normalize(palavra, Normalizer.Form.NFD);
            palavra = palavra.replaceAll("[^a-zA-Z0-9]", ""); 
            palavra = palavra.toLowerCase();

            int tamanhoPalavra = palavra.length();

            if (tamanhoPalavra < 3) {
                System.out.println("Não é um Palíndromo");
            } else {

                // Vetor original
                char[] letras = palavra.toCharArray();

                // Vetor invertido
                char[] invertida = new char[tamanhoPalavra];
                for (int i = 0; i < tamanhoPalavra; i++) {
                    invertida[i] = letras[tamanhoPalavra - 1 - i];
                }

                // Comparar
                boolean palindromo = true;
                for (int i = 0; i < tamanhoPalavra; i++) {
                    if (letras[i] != invertida[i]) {
                        palindromo = false;
                        break;
                    }
                }

                if (palindromo) {
                    System.out.println("É um palíndromo!");
                } else {
                    System.out.println("Não é um palíndromo!");
                }
            }

            // Perguntar se deseja continuar
            System.out.println("\nDeseja verificar outra palavra? (s/n)");
            continuar = leia.nextLine();
        }

        System.out.println("Obrigada pela sua visita ! Esperamos que tenha gostado da experiência. Volte sempre!");
        leia.close();
    }
}
