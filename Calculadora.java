package calculadora;

import java.util.Scanner;


public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("CALCULADORA");
System.out.println("Ingrese el primer número");

Scanner scan = new Scanner(System.in);

int num1 = scan.nextInt();

System.out.println("Ingrese el operador");
char operador = scan.next().charAt(0);


System.out.println("Ingrese el segundo número");
int num2 = scan.nextInt();

int resultado = calc(num1, num2, operador);
System.out.println("El resultado es " + resultado);
	}

	public static int calc (int a, int b, char c){
		if (c == '+') {
		int res = a+b;
		return res;
		}
		else if (c == '-') {
			int res = a-b;
			return res;
		}
		else if (c == '/') {
			int res = a/b;
			return res;
		}
		else {
			int res = a*b;
			return res;
		}
	
	}
}
