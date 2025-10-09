package curso_programacao;

import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		
		// 1. Definição das variáveis (como no exercício)
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code  = 5290;
		char gender = 'F'; 
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		

		Locale.setDefault(Locale.US); 
		
		// 2. Produção da saída no console
		
		// Produtos
		System.out.println("Products:");
		// Para replicar a saída, a formatação precisa ser: String, texto literal com o cifrão e double formatado
		System.out.printf("%s, which price is $ %.2f\n", product1, price1);
		System.out.printf("%s, which price is $ %.2f\n", product2, price2);
		
		// Quebra de linha
		System.out.println(); 
		
		// Recorde
		// %d para int (age e code), %c para char (gender)
		System.out.printf("Record: %d years old, code %d and gender: %c\n", age, code, gender);
		
		// Quebra de linha
		System.out.println(); 
		
		// Medidas e Formatação Decimal
		// Medida com 8 casas: %.8f
		System.out.printf("Measue with eight decimal places: %.8f\n", measure);
		
		// Arredondado com 3 casas: %.3f
		System.out.printf("Rouded (three decimal places): %.3f\n", measure);
		
		// Decimal US: %.3f. O exercício pede 53.235, o que é o valor arredondado.
		System.out.printf("US decimal point: %.3f\n", measure);

	}
}