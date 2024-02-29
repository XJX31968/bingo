package bingo;

public class Start {

	public static void main(String[] args) {
		
		
		
		bingo.Bingo bingo = new bingo.Bingo();
		Carton carton = new bingo.Carton();
		
		bingo.rellenarBingo();
		System.out.println(bingo);
		System.out.println(carton);
		
		Arbitro arbitro = new Arbitro(bingo, carton);
		if (arbitro.comprobarGanador()) {
		    System.out.println("¡Has ganado el Bingo!");
		} else {
		    System.out.println("Lo siento, no has ganado esta vez.");
		
		
		
	}

}
}
