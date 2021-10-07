package tadListaArranjo.score.gameEntry;

/**
 * @author Geovane Donizete Laera  - RA: 1902679 
 * @author Isaque Ribeiro dos Santos Junior - RA: 1903978
 * @author Marcelo Martinez Mesa Campos - RA: 1905076 
 * @author Paulo Ricardo Costa da Silva - RA: 1905013 
 * @author Vinícius da Cruz Pera - RA: 1903144
 * Data: 15/09/2021
 *
 */
public class Scores {
	// Cria a variável maxEntries, que armazena a quantidade de scores que serão armazenados
	public static final int maxEntries = 10;
	
	// Cria a variável numEntries, que armazena a quantidade de registros
	protected int numEntries;
	
	// Cria o arranjo de registros, que armazena os nomes e os scores
	protected GameEntry[] entries;
	
	// Método construtor
	public Scores() {
		entries = new GameEntry[maxEntries];
		numEntries = 0;
	}
	
	// Método que converte a lista para String
	public String toString() {
		String s = "[";
		
		for (int i = 0; i < numEntries; i++) {
			if (i > 0) { 
				s += ", ";
			}
			
			s += entries[i];
		}
		
		return s + "]";
	}
	
	// Método que tenta inserir um novo score na coleção
	public void add(GameEntry e) {
		int newScore = e.getScore();
		
		if (numEntries == maxEntries) { 
			if (newScore <= entries[numEntries - 1].getScore()) {
				return; 
			} 
			else {
				numEntries--;
			}
		} 
			
		numEntries++;
			
		int i = numEntries - 1;
		
		for (; (i >= 1) && (newScore > entries[i - 1].getScore()); i--) {
			entries[i] = entries[i - 1]; 
		}
		
		entries[i] = e;
	}
}