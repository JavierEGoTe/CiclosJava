import java.util.Scanner;

public class NumerosIguales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroUno = 0;
		int numeroDos = 0;
		/*int numeroUno = 0;
		int numeroDos = 1;
		while (numeroUno != numeroDos) {
			System.out.println("Escribe el primer numero: ");
			Scanner in = new Scanner(System.in);
			numeroUno= in.nextInt();
			System.out.println("Escribe un segundo numero: ");
			numeroDos= in.nextInt();
			System.out.println("Numero Uno: "+ numeroUno);
			System.out.println("Numero Dos: "+ numeroDos);
		}*/
		do {
			System.out.println("Escribe el primer numero: ");
			Scanner in = new Scanner(System.in);
			numeroUno= in.nextInt();
			System.out.println("Escribe un segundo numero: ");
			numeroDos= in.nextInt();
			System.out.println("Numero Uno: "+ numeroUno);
			System.out.println("Numero Dos: "+ numeroDos);
			}while(numeroUno != numeroDos);
		
		System.out.println("Los numeros son iguales hemos detenido el programa");		
	}

}
