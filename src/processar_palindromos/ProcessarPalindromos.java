package processar_palindromos;

import java.util.Scanner;

public class ProcessarPalindromos {

	public static void main(String[] args) {
	
	// Receber a string 
	
	Scanner leia = new Scanner(System.in);
	
	String palavra;
	
	System.out.println("Digite uma palavra: ");
	palavra= leia.nextLine();
		
	//Fazer o lenght 
	
	int tamanhoPalavra = palavra.length();
    System.out.println("O tamanho da String é: " + tamanhoPalavra);
		
	//Validar se é maior que 3 e se é impar 
    
    if (tamanhoPalavra <3 || tamanhoPalavra % 2 == 0) {
    	System.out.println("Não é um Palindromo");
    }
   
  //Fazer logica 
    
		
	


	}

}
