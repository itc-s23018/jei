//s23018 d50
//列挙型の問題

enum Condition { ROAD, MUD, SNOW}

class d50Q26kadai {
	public static void main(String[] args) {
		for(int i = 0; i < Condition.values().length; i++ ){
			System.out.println(Condition.values()[i]);
		}
	}
}
