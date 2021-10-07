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
public interface IndexList<E> {
	// Retorna o número de elementos na lista
	public int size();
	
	// Retorna se a lista está vazia
	public boolean isEmpty();
	
	// Insere um elemento "e" no índice "i", deslocando todos os elementos depois dele
	public void add(int i, E e) throws IndexOutOfBoundsException;
	
	// Retorna um elemento no índice "i", sem removê-lo
	public E get(int i) throws IndexOutOfBoundsException;
	
	// Remove e retorna o elemento do índice "i", deslocando todos os elementos depois dele
	public E remove(int i) throws IndexOutOfBoundsException;
	
	// Troca o elemento de "i" com "e", retornando o elemento que estava em "i"
	public E set(int i, E e) throws IndexOutOfBoundsException;
}
