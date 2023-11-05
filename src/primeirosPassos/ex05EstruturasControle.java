package primeirosPassos;

import javax.swing.JOptionPane;

public class ex05EstruturasControle {

	public static void main(String entrada[]) {
		
		int num;
		char option = 0;
		String msg = "", msgEntrada = "Digite 1 para par/ímpar \nDigite 2 para positivo/negativo";
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
		option = (JOptionPane.showInputDialog(msgEntrada)).charAt(0);
		
		switch (option) {
		case '1':{
			if (num % 2 == 0) {
				msg = msg + num + " é par. \n";
			}
			else {
				msg = msg + num + "é ímpar. \n";
			}
			break;
		}
		case '2':{
			if(num > 0) {
				msg = msg + num + " é positivo. \n";
			}
			else {
				msg = msg + num + " é negativo. \n";
			}
			break;
		}
		default: JOptionPane.showMessageDialog(null, "Opção inválida, calculos não realizado.");
		
		}
		
		if (option == '1' || option == '2'){
			JOptionPane.showMessageDialog(null, msg);	
		}
			
		System.exit(0);
	}

}
