package bingo;

import java.util.Arrays;


public class Bingo {

	
	
	public int bingo[];
	
	
	
	
	
	
	
	
	public Bingo() {
		
		bingo= new int[99];
		
	}







	public void rellenarBingo() {
		
		
		for(int i=0; i<=(bingo.length-1);i++) {
			
			bingo[i]=(int) (Math.random() * 100);
			
		}
		
		
	}







	@Override
	public String toString() {
		return "Bingo [bingo=" + Arrays.toString(bingo) + "]";
	}








	
	
}
