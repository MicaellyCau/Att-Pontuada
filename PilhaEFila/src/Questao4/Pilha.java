package Questao4;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {
	  public static boolean ehPalindromo(String nome) {
	        Stack<Character> pilha = new Stack<>();
	        String n = nome.replaceAll("", "").toLowerCase();
	        int tamanho = n.length();
	        int meio = tamanho / 2;


	        for (int i = 0; i < meio; i++) {
	            pilha.push(n.charAt(i));
	        }

	     
	        if (tamanho % 2 != 0) {
	            meio++;
	        }

	    
	        for (int i = meio; i < tamanho; i++) {
	            if (n.charAt(i) != pilha.pop()) {
	                return false; 
	            }
	        }
	        
	        return true; 
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite uma palavra: ");
	        String palavra = scanner.nextLine();
	        
	        if (ehPalindromo(palavra)) {
	            System.out.println("A palavra é um palíndromo.");
	        } else {
	            System.out.println("A palavra não é um palíndromo.");
	        }

	        scanner.close();
	    }
		
}
