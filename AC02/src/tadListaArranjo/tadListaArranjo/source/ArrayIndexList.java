package tadListaArranjo.tadListaArranjo.source;

/**
 * @author Geovane Donizete Laera  - RA: 1902679 
 * @author Isaque Ribeiro dos Santos Junior - RA: 1903978
 * @author Marcelo Martinez Mesa Campos - RA: 1905076 
 * @author Paulo Ricardo Costa da Silva - RA: 1905013 
 * @author Vinícius da Cruz Pera - RA: 1903144
 * Data: 15/09/2021
 *
 */
public class ArrayIndexList<E> implements IndexList<E> {
	// Cria o arranjo de A, que armazena os elementos da lista
	private E[] A;
	
	// Cria a variável capacity, que armazena o tamanho inicial do arranjo A
	private int capacity = 16;
	
	// Cria a variável size, que armazena a quantidade de elementos armazenados na lista
	private int size = 0;
	
	// Método construtor que cria a lista indexada com capacidade de 16 elementos
	@SuppressWarnings("unchecked")
	public ArrayIndexList() {
		A = (E[]) new Object[capacity];
	}
	
	// Método que retorna a quantidade de elementos na lista
	public int size() { 
		return size; 
	}
	
	// Método que retorna se a lista está vazia
	public boolean isEmpty() { 
		return size() == 0; 
	}
	
	// Método que retorna o elemento armazenado em um dado índice
	public E get(int r) throws IndexOutOfBoundsException {
		checkIndex(r, size());
		return A[r];
	}
	
	// Método que troca o elemento armazenado em um dado índice
	public E set(int r, E e) throws IndexOutOfBoundsException {
		checkIndex(r, size());
		E temp = A[r];
		A[r] = e;
		return temp;
	}
	
	// Método que insere um elemento em um dado índice
	public void add(int r, E e) throws IndexOutOfBoundsException {
		checkIndex(r, size() + 1);
		
		if (size == capacity) {
			capacity *= 2;
			
			@SuppressWarnings("unchecked")
			E[] B = (E[]) new Object[capacity];
			
			for (int i = 0; i < size; i++) {
				B[i] = A[i];
			}
			
			A = B;
		}
		
		for (int i = size - 1; i >= r; i--) {
			A[i + 1] = A[i];
		}
		
		A[r] = e;
		size++;
	}
	
	// Método que remove um elemento armazenado em um dado índice
	public E remove(int r) throws IndexOutOfBoundsException {
		checkIndex(r, size());
		E temp = A[r];
		
		for (int i = r; i < size - 1; i++) {
			A[i] = A[i + 1];
		}
		
		size--;
		return temp;
	}
	
	// Método que verifica se o índice pertence ao intervalo [0, n-1]
	protected void checkIndex(int r, int n) throws IndexOutOfBoundsException { 
		if (r < 0 || r >= n) {
			throw new IndexOutOfBoundsException("Illegal index: " + r);
		}
	}
	
	// Método que converte a lista para String
	public String toString() {
		String toReturn = "(";
		
		if (size() == 0) {
			return "()";
		}
		
		for (int i = 0; i < size(); i++) {
			toReturn += A[i].toString() + ", ";
		}
		
		return toReturn.substring(0, toReturn.length() - 2) + ")";
	}
}