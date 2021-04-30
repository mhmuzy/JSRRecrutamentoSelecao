package Hitss.Treinamento.Repositorio;

import java.util.ArrayList;
import java.util.Iterator;

public class RepositorioMetodo {
	public static void mostrarDados() {
		System.out.println("");
		System.out.println("      Hitss Treinamento");
		System.out.println("");
		System.out.println("Prezado(a) Usuário(a), Estamos em Desenvolvimento no Momento.");
		System.out.println("");
		
		String[] Sexo = new String[4];
		Sexo[1] = "M";
		Sexo[2] = "F";
		Sexo[3] = "F";
		
		int[] Idade = new int[4];
		Idade[1] = 28;
		Idade[2] = 30;
		Idade[3] = 27;
		
		boolean[] Experiencia = new boolean[4];
		Experiencia[1] = true;
		Experiencia[2] = true;
		Experiencia[3] = false;
		int count = 0;
		
		
		ArrayList<String> sexo = new ArrayList();
		sexo.add(Sexo[1]);
		sexo.add(Sexo[2]);
		sexo.add(Sexo[3]);
		
		
		 	 //System.out.println(sexo.get(3));
		 
		
	}
}
