package bingo;

import java.util.Arrays;

public class Arbitro {

	
	private Bingo bingo;
	private Carton carton;
	private boolean HayBingo=false;
	
	 public Arbitro(Bingo bingo, Carton carton) {
		 
		 this.bingo = bingo;
		 this.carton = carton;
		 
	 }
	 
	 public boolean comprobarGanador() {
	        // Comprobar filas
	        for (int i = 0; i < carton.carton.length; i++) {
	            boolean filaGanadora = true;
	            for (int j = 0; j < carton.carton[i].length; j++) {
	                if (!contieneNumero(carton.carton[i][j])) {
	                    filaGanadora = false;
	                    break;
	                }
	            }
	            if (filaGanadora) {
	                return true;
	            }
	        }

	        // Comprobar columnas
	        for (int i = 0; i < carton.carton[0].length; i++) {
	            boolean columnaGanadora = true;
	            for (int j = 0; j < carton.carton.length; j++) {
	                if (!contieneNumero(carton.carton[j][i])) {
	                    columnaGanadora = false;
	                    break;
	                }
	            }
	            if (columnaGanadora) {
	                return true;
	            }
	        }

	        return false;
	    }

	    public boolean contieneNumero(int numero) {
	        for (int i = 0; i < bingo.bingo.length; i++) {
	            if (bingo.bingo[i] == numero) {
	                return true;
	            }
	        }
	        return false;
	    }
	}

