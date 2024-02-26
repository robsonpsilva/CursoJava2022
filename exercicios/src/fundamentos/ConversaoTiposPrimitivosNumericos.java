package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 1; //Conversão implícita
		
		System.out.println(a);
		
		float b = 1.0F;
		//Observe que 1.0 denota double, assim é preciso fazer conversão de tipos
		//Entãop é preciso colocar o F para forçar a ser float
		
		float c = (float) 1.23456789999999; //Conversão explícita
		double d = 1.23456789999999;
		
		System.out.println(c);
		System.out.println(d);
		
		int e = 4;
		byte f =(byte) e;
		System.out.println(f);
		
		double nota = 1.999999;
		int h = (int) nota;
		System.out.println(h);

	}

}
