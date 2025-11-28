package processar_palindromos;

import java.util.Scanner;

public class ProcessarPalindromos {

	public static void main(String[] args) {
	
	//Receber a string 
	
	Scanner leia = new Scanner(System.in);
	
	String palavra;
	
	System.out.println("Digite uma palavra: ");
	palavra= leia.nextLine();
		
	//Fazer o lenght 
	
	int tamanhoPalavra = palavra.length();
		
	//Validar se é maior que 3 e se é impar 
    
    if (tamanhoPalavra < 3) {
    	System.out.println("Não é um Palíndromo");
    	return; // encerra o programa aqui
    }
   
    //Vetor da palavra
    char[] letras = palavra.toCharArray();
    
    //Vetor Invertido 
    char[] invertida = new char[tamanhoPalavra];
    for (int i = 0; i < tamanhoPalavra; i++) {
        invertida[i] = letras[tamanhoPalavra - 1 - i];
    }

    //Comparar se é palíndromo
    boolean palindromo = true;

    for (int i = 0; i < tamanhoPalavra; i++) {
        if (letras[i] != invertida[i]) {
            palindromo = false;
            break;
        }
    }

    //Mostrar resultado
    if (palindromo) {
        System.out.println("É um palíndromo!");
    } else {
        System.out.println("Não é um palíndromo!");
    }
    
    leia.close();
	
	}
}
