package bingo;

import java.util.Arrays;

public class Carton {

	
	public int carton[][];
	private  int fila = 5;
	private  int columna = 5;
	
	
	public Carton() {
		
		carton = new int[fila][columna];
		for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                carton[i][j] = (int) (Math.random() * 100);
            }
		}
	}
	
	public String toString() {
        String result = "Carton [\n";
        for (int i = 0; i < fila; i++) {
            result += "[";
            for (int j = 0; j < columna; j++) {
                result += carton[i][j];
                if (j < columna - 1) {
                    result += ", ";
                }
            }
            result += "]\n";
        }
        result += "]";
        return result;
    }
	
	 
	

	
	
}
