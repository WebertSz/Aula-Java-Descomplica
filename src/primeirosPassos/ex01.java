package primeirosPassos;

public class ex01 {

	public static void main(String entrada[]) {
		// TODO Auto-generated method stub
		int numInt;
		double numReal, soma;
		char caracter;
		
		numInt = Integer.parseInt(entrada[0]);
		numReal = Double.parseDouble(entrada[1]);
		caracter = (entrada[2].charAt(0));
		
		soma = (double)numInt + numReal;
		System.out.println((double)numInt + " + " + numReal + " = " + soma + " sinal " + caracter);
		
		System.exit(0);
	}

}
