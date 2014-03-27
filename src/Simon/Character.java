package Simon;

public class Character {

	String Name;
	int STR;
	int INT;
	int VERT;
	int HP;

	int[][] Position;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSTR() {
		return STR;
	}

	public void setSTR(int sTR) {
		STR = sTR;
	}

	public int getINT() {
		return INT;
	}

	public void setINT(int iNT) {
		INT = iNT;
	}

	public int getVERT() {
		return VERT;
	}

	public void setVERT(int vERT) {
		VERT = vERT;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int[][] getPosition() {
		return Position;
	}

	public void setPosition(int[][] position) {
		Position = position;
	}

	// int Attack = STR + (10*INT)/STR;
	// int Abwehr = (int) (VERT + (0.25 * INT));

}
