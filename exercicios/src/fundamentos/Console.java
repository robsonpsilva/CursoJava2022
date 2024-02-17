package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Megasena %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);
		System.out.print("Teste\n");
		
		System.out.printf("Mais Megasena  com outra forma de quebrar linha %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		System.out.print("Teste 2 \n");
		
		//Now we will get information from keyboard
		//The function scanner monitor the user input by the keyboard
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Seu nome é " + nome);

		entrada.close();
	}

}
