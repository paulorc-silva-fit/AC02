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
public class GameEntry {
	// Cria a variável name, que armazena o nome da pessoa que obteve o score
	protected String name;

	// Cria a variável score, que armazena o valor do score
	protected int score;
	
	// Método construtor que cria um registro do jogo
	public GameEntry(String n, int s ) {
		name = n;
		score = s;
	}
	
	// Método que retorna o nome do jogador
	public String getName() { 
		return name; 
	}
	
	// Método que retorna o score do jogador
	public int getScore() { 
		return score; 
	}
	
	// Método que retorna uma string com a representação deste registro
	public String toString() { 
		return "(" + name + ", " + score + ")" ; 
	}
}