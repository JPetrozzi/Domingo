package Utilities;

import java.util.Scanner;

import Model.Persona;

public class TestDB {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		String scan;
		Scanner entradaEscaner = new Scanner (System.in);
		System.out.println("Alta de persona.");
		System.out.println("Nombre y apellido: ");	
		p.setNombre(entradaEscaner.nextLine());
		System.out.println("Usuario: ");
		p.setUser(entradaEscaner.nextLine());
		System.out.println("Password: ");
		p.setPassword(entradaEscaner.nextLine());
		System.out.println("Password encriptada: " + p.getPassword());
		scan = entradaEscaner.nextLine();
		p = p.create();
		System.out.println(p.getMensaje().getMessage());
		scan = entradaEscaner.nextLine();
	}

}
