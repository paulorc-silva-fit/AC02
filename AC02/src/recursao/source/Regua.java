package recursao.source;

/**
 * @author Paulo Ricardo Costa da Silva - RA: 1905013 
 * @author Geovane Donizete Laera  - RA: 1902679 
 * @author Marcelo Martinez Mesa Campos - RA: 1905076 
 * @author Isaque Ribeiro dos Santos Junior - RA: 1903978
 * @author Vinícius da Cruz Pera - RA: 1903144
 * Data: 08/09/2021
 *
 */
public class Regua {
	// Método construtor
	public static void drawOneTick(int tickLength) {  
		drawOneTick(tickLength, -1);  
	}

	// Método que desenha 1 risco da régua
	public static void drawOneTick(int tickLength, int tickLabel) {
		for (int i = 0; i < tickLength; i++) {
			System.out.print("-");
		}
		
		if (tickLabel >= 0) {
			System.out.print(" " + tickLabel);
		}
		
		System.out.print("\n");
	}
	
	// Método que desenha os demais riscos da régua
	public static void drawTicks(int tickLength) {
		if (tickLength > 0) {
			drawTicks(tickLength - 1);
			drawOneTick(tickLength);
			drawTicks(tickLength - 1);
		}
	}
	
	// Método que desenha a régua
	public static void drawRuler(int nInches, int majorLength) {
		drawOneTick(majorLength, 0);
		
		for (int i = 1; i <= nInches; i++) {
			drawTicks(majorLength - 1);
			drawOneTick(majorLength, i);
		}
	}

	// Método principal
	public static void main(String[] args) {
		drawRuler(1, 5);
	}

}