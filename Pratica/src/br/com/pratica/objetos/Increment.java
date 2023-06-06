package br.com.pratica.objetos;

public class Increment {

	public static void main(String[] args) {
		
		int c = 5;
		System.out.printf(" c before postincrement: %d%n", c); //imprime 5
		System.out.printf("   postincrement c: %d%n", c++); //impreme 5 
		System.out.printf(" c after postincrement: $d%n", c); //impreme 6
		
		System.out.println(); //pula uma linha
		
		//demonstra o operador de pré-increment
		c =5;
		System.out.printf(" cbefore preincrement: %d%n", c);
		System.out.printf("     preincrement c: %d%n", c++);
		System.out.printf(" c after postincrement: %d%n", c);
	}

}
