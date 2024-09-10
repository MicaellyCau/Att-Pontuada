package questao2;

public class FibonacciRecursividade {

	    public static int fibonacci(int n) {
	        if (n == 0) {
	            return 0;
	        } else if (n == 1) {
	            return 1;
	        } else {
	            return fibonacci(n - 1) + fibonacci(n - 2);
	        }
	    }
	    public static void imprimirFibonacciAte100(int n) {
	        int resultado = fibonacci(n);
	        
	        if (resultado > 100) {
	            return; 
	        }

	        System.out.println("Fibonacci(" + n + ") = " + resultado);

	        imprimirFibonacciAte100(n + 1); 
	    }

	    public static void main(String[] args) {
	        imprimirFibonacciAte100(0);
	    }
	
}



