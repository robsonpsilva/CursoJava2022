package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número");
		
		Double numero1 = Double.parseDouble(valor1);
		Double numero2 = Double.parseDouble(valor2);
		
		System.out.println(numero1 + numero2);
	}	

}
