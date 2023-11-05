package primeirosPassos;

import javax.swing.JOptionPane;

public class ex06EstruturaRepeticao {

	public static void main(String Entrada[]) {
		
		int tabuada;
		char option = 0;
		String msg = "", msgEntrada = "Digite 1 para repição for \n Digite 2 para Repitação while \n Digite 3 para repetição do/while";
		
		tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
		option = (JOptionPane.showInputDialog(msgEntrada)).charAt(0);
		
		switch(option) {
		case '1':{
			msg = msg + "Tabuada de " + tabuada + " pelo for: \n\n";
			for (int i = 1; i <= 10; i = i + 1) {
				msg = msg + tabuada + " x " + i + " = " + tabuada * i + "\n";
			}
			break;
		}
		case '2':{
			msg = msg + "Tabuada de " + tabuada + " pelo while: \n\n";
			int i = 1;
			while(i <= 10) {
				msg = msg + tabuada + " x " + i + " = " + tabuada * i + "\n";
				i = i + 1;
			}
			break;
		}
		case '3':{
			msg = msg + "Tabuada de " + tabuada + " pelo do/while: \n\n";
			int i = 1;
			do {
				msg = msg + tabuada + " x " + i + " = " + tabuada * i + "\n";
				i = i + 1;
			} while(i <= 10);
			break;
		}
		default: JOptionPane.showMessageDialog(null, "Opção inválida calculos não realizados.");
		}
		
		if(option >= '1' && option <= '3') {
			JOptionPane.showMessageDialog(null, msg);
		}
		
		System.exit(0);

	}

}
