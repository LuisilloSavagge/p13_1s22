import java.util.Scanner;

public class P13_1s22{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String operacion;

		System.out.println("programa que realiza operaciones basicas");
		System.out.println("que operaciones desea: suma, resta");
		operacion = teclado.nextLine();
		if(operacion == "suma"){
			System.out.println("aqui debemos realizar una suma");
		}
		if(operacion == "resta"){
			System.out.println("aqui debemos realizar una resta");
		}
	}