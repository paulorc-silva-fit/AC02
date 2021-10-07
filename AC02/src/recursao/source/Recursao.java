package recursao.source;

import java.util.Arrays;

/**
 * @author Paulo Ricardo Costa da Silva - RA: 1905013 
 * @author Geovane Donizete Laera  - RA: 1902679 
 * @author Marcelo Martinez Mesa Campos - RA: 1905076 
 * @author Isaque Ribeiro dos Santos Junior - RA: 1903978
 * @author Vinícius da Cruz Pera - RA: 1903144
 * Data: 08/09/2021
 *
 */
public class Recursao {
	// Método que realiza o cálculo do fibonacci de forma binária
	public Integer binaryFib(int k) {
    	if (k <= 1){
    		return k;  
        }
        else{
        	return binaryFib(k-1) + binaryFib(k-2);
        }
	}
	
	// Método que realiza a soma dos números de um array de forma binária
	public Integer binarySum(Integer[] A, int i, int n) {
		if (n == 1){
        	return A[i];  
        }
        
        return binarySum(A, i, roundUp(n, 2)) + binarySum(A, i + roundUp(n, 2), n/2);
    }
	
	// Método que realiza a inversão de um array de forma iterativa
	public String iterativeReverseArray(Integer[] A, int i, int j) {
		while (i < j) {
			int aux = A[i];
			A[i] = A[j];
			A[j] = aux;   
	    
			i += 1;
			j -= 1;
		}
	
		return Arrays.toString(A);
	}
	
	// Método que realiza o cálculo do fibonacci com recursão linear
	public Par linearFibonacci(int k) {
		Par p;
		
	    if (k <= 1) {
	    	return new Par(k, 0);  
	    }
	    else{        
	        p = linearFibonacci(k-1);
	    }
	      
	    return new Par(p.getI() + p.getJ(), p.getI()); 
	}
	
	// Método que realiza a soma dos números de um array com recursão linear
	public Integer linearSum(Integer[] A, int n) {
		if (n == 1){
    		return A[0];  
    	}
    	else{
    		return linearSum(A, n-1) + A[n-1];
    	}
	}

	// Método que realiza o cálculo do fatorial de um número de forma recursiva
	public Integer recursiveFactorial(int n) {
		if (n == 0){
        	return 1;  
        }
        else{
        	return n * recursiveFactorial(n-1);
        }
	}
	
	// Método que realiza a inversão de um array de forma recursiva
	public String reverseArray(Integer[] A, int i, int j) {
		if (i < j) {
    		int aux = A[i];
    		A[i] = A[j];
    		A[j] = aux;
             
    		reverseArray(A, i+1, j-1);
    	}
    
    	return Arrays.toString(A);
	}

	// Método responsável por arredondar o valor para cima
	private int roundUp(int n, int i) {
		int r = n % i;
		int q = n / i;
		if (r == 0) {
			return q;
		}
		
		return q + 1;
	}
}
