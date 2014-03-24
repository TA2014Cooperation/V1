package Adventure;

public class Karte {
	
	
	boolean[][] Karte = new boolean[20][20];
	
	
	
	
	public String toString(){
		
		String puffer = "";
		
		for (int i = 0; i< Karte.length; i++){
			
			
			for (int j = 0; j< Karte.length; j++){
				
				if (Karte[i][j] == true){
					
					puffer = puffer + "O";
					
				}
				
			}
			
			puffer = puffer + "\n";
			
		}
		
		
		
		return puffer;
	}
	
	
	
	
	
	public Karte(){
		
		for (int i = 0; i< Karte.length; i++){
			
			
			for (int j = 0; j< Karte.length; j++){
				
				Karte[i][j] = true;
				
			}
		}
		
		
		
		
		
	}
	

	
	

}
