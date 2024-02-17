package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		double a =2.3;
		String s = "Bom Dia X!";
		s = s.toUpperCase();
		s = s.replace("X", "Senhora");
		s = s.concat("!!!");
		System.out.println(s);
		
		String y = "Bom Dia X!".replace("X", "Senhora").toUpperCase().concat("!!!!");
		System.out.println(y);
		
	}

}
