package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double raio = 3.4;
		final double PI = 3.14159; //The keyword final converts a variable in a constant
									//It is a convention to use constant names using CAPS letters
		double area = PI*Math.pow(raio, 2);
		
		System.out.println(area);

	}

}
