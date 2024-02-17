package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa TARDE"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade =34;
		var salario = 12345.987;
		
		//Follow we see a way to format strings
		System.out.printf("O senhor %s %s tem %d anos e ganha $%.2f.\n", nome, sobrenome, idade, salario);
		
		//String.format function work the same way System.out.printf() work.
		String frase = String.format("O Senhor %s %s tem %d anos e ganha $%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		//The next function help us to find if a string contains the word we are searching
		System.out.println("Frase  qualquer".contains("qual"));
		
		//The next function gets the position where a substring starts in another string
		System.out.println("Frase qualquer".indexOf("qual"));
		
		//We can also ask the substring start in in the index position x that we choose.
		System.out.println("Frase qualquer".substring(6));
		
		System.out.println("Frase qualquer".substring(6,8));
		
	
	}

}
