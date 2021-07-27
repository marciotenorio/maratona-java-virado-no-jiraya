package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
	public static void main(String[] args) {
		//+ - / *
		int numero01 = 10;
		int numero02 = 20;
		
		/**
		 * a operação entre dois inteiros sempre sera um inteiro
		 * entender com precedência? double>int por exemplo 
		 * da pra fazer um cast também no medio da operação
		*/
		
		//A partir da string a sobrecarga do + vai concatenar
		System.out.println(numero01 + "valor" + numero01 + numero02);
		
		// %
		int resto = 21 % 7;
		System.out.println(resto);
		
		//< > <= >= == !=  
		boolean isDezMaiorQueVinte = 10 > 20; 
		boolean isDezMenorQueVinte = 10 < 20; 
		boolean isDezIgualQueVinte = 10 == 20; 
		boolean isDezIgualDez = 10 == 20; 
		boolean isDezDiferenteDez = 10 != 20;
		//Não se pode comparar todos os tipos; int == String
		
		System.out.println(isDezMaiorQueVinte);
		System.out.println(isDezMenorQueVinte);
		System.out.println(isDezIgualDez);
		System.out.println(isDezIgualQueVinte);
		System.out.println(isDezDiferenteDez);
		
		// && (AND) || (OR) !(NOT)
		int idade = 35;
		float salario = 3500F;
		boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 41612;
		
		System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
		
		
		double valorTotalContaCorrente = 200;
		double valorTotalContaPoupanca = 10000;
		float valorPlaystation = 5000F;
		boolean isPlaysTationCIncoComprovavel = valorTotalContaCorrente > valorPlaystation || 
											    valorTotalContaPoupanca > valorPlaystation;									    
		System.out.println("isPlaystationCincoCompravel: " + isPlaysTationCIncoComprovavel);
		
		// = += -= /= *= %=
		double bonus = 1800;
		bonus +=  1000;
		System.out.println(bonus);
		
		// ++ -- unary opertators
		// ++ || -- antes -> primeiro incrementa depois executa
		int example = 0;
		System.out.println(example++); // == 0
		
		// ++ || -- depois -> primeiro incrementa depois executa
		System.out.println(++example); // == 2    
	}
}
