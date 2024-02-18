package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Byte
		
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.shortValue());
		System.out.println(i.intValue());
		System.out.println(l.floatValue());
		
		Scanner entrada = new Scanner(System.in); 
		i = Integer.parseInt(entrada.next());
		System.out.println(i.intValue()*3);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		bo = Boolean.TRUE;
		System.out.println(bo);
		entrada.close();

		Character c = '#';
		System.out.println(c);
	}

}
