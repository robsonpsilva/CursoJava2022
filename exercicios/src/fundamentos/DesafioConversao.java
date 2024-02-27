package fundamentos;

import java.util.Scanner;
import java.util.Locale;

public class DesafioConversao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(new Locale("en", "US")); //Seta o locale para o padrão americano
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Digite os últimos três salários do empregado. ");
		
		System.out.println("Digite o salário de três meses atrás. ");
		String salario1 = entrada.nextLine();	
		
		System.out.println("Digite o salário de dois meses atrás. ");
		String salario2 = entrada.nextLine();
		
		System.out.println("Digite o salário de um mes atrás. ");
		String salario3 = entrada.nextLine();
		
		try {
			salario1 = salario1.replace(',', '.');
			double numero1 = Double.parseDouble(salario1);
			
			salario2 = salario2.replace(',', '.');
			double numero2 = Double.parseDouble(salario2);
			
			salario3 = salario3.replace(',', '.');
			double numero3 = Double.parseDouble(salario3);
			
			double media = (numero1 + numero2 + numero3) / 3;
			System.out.println("O salário médio é :" + Double.toString(media));
		}
		catch(Exception e){
			System.out.println("Erro! Favor verifique sua entrada de dados!");
		}
		
		
		entrada.close();
			
	}

}
