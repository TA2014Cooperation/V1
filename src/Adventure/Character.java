package Adventure;

public class Character {
	
	String Name;
	int STR;
	int INT;
	int VERT;
	int HP;
	
	int Attack = STR + (10*INT)/STR; 
	int Abwehr = (int) (VERT + (0.25 * INT));
	
	
	
	
	
	
	

}
