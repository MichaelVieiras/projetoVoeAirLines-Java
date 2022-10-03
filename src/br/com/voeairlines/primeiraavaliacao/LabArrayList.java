package br.com.voeairlines.primeiraavaliacao;

import java.util.ArrayList;
import java.util.Scanner;

public class LabArrayList {
	String aeroNave;
	ArrayList<String> aeroNaves = new ArrayList<String>();
	Scanner scan = new Scanner(System.in);
	
	public void adicionarAeronave() {
		System.out.println("Informe a Aeronave: ");
		aeroNave = scan.nextLine();
		aeroNaves.add(aeroNave);

	}
	public void listarAeronave() {
		
		aeroNaves.forEach(a-> System.out.println("*" + (aeroNaves.indexOf(a)+ 1) + " " + a + "*"));
		
		/*for(String aeroNave:aeroNaves) {
				System.out.println("*" + (aeroNaves.indexOf(aeroNave)+ 1) + " " + aeroNave + "*");
		}*/
	}
	public void mostrarAeronave(int indice) {
		String aeroNaveEscolhida = aeroNaves.get(indice - 1);
		System.out.println(aeroNaveEscolhida);
	}
	public void removerAeronave(int indice) {
		aeroNaves.remove(indice - 1);
	}
}
