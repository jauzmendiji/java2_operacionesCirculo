import java.util.Scanner;

public class OperacionesCirculo {

	public static void main (String args[]) {


		double radio, resultadoPeri, resultadoArea;
		Circulo circulo = new Circulo();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIngresa el radio: ");
		radio = sc.nextInt();
		circulo.setRadio(radio);

		resultadoPeri = circulo.peri();
		resultadoArea = circulo.area();

		System.out.println("\nEl perimetro es: " + resultadoPeri);
		System.out.println("\nEl área es: " + resultadoArea);
	
	}
}
