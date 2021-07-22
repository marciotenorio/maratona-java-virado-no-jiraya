package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
	public static void main(String[] args) {
		//int, double, float, char, byte, short, long, boolean
		
		int idade = (int) 100000000000000L; // cast com perca long > int					
										//4 bytes
		long numeroGrande = 100000;		//8 bytes | 1000000L
		double salarioDouble = 2000;	//8 bytes | Ao por . o javac entende que double | 0.0D
		float salarioFloat = (float) 2500.0D; // cast		
										//4 bytes | 2500f identifica como float, default double
		byte idadeByte = -128;			//1 byte
		short idadeShort = 10;			//2 bytes	
		boolean trueOrFalse = false;	//1 bit
		char caractere = 10;			//2 bytes Unicode ou ASCII
		String a = "Texto grande";

		System.out.println(idadeByte);
		System.out.println(a);
	}
}
