package Hitss.Treinamento.Repositorio;

import java.util.ArrayList;
import java.util.Iterator;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class RepositorioMetodo {
	public static void mostrarDados() {
		System.out.println("");
		System.out.println("      Hitss Treinamento");
		System.out.println("");
		System.out.println("Prezado(a) Usu�rio(a), Estamos em Desenvolvimento no Momento.");
		System.out.println("");
		System.out.println("Dados da Pesquisa");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("");
		String[] Sexo = new String[4];
		Sexo[1] = "M";
		Sexo[2] = "F";
		Sexo[3] = "F";
		
		int[] Idade = new int[4];
		Idade[1] = 28;
		Idade[2] = 30;
		Idade[3] = 28;
		
		boolean[] Experiencia = new boolean[4];
		Experiencia[1] = true;
		Experiencia[2] = true;
		Experiencia[3] = false;
		
		int count = 0;
		for (int i = 0; i < Sexo.length; i++) {
				 			
			if (Sexo[i] == "F") {
			 				
				count += 1;
					
			 					if (count > 1) {
			 						System.out.println("O N�mero de Candidatos do Sexo Feminino �: " + count);
			 				 		
								}
			 				
			 				}
				
	
		}
		
		int count2 = 0;
		for (int j = 0; j < Sexo.length; j++) {
			
		if (Sexo[j] == "M") {
				
			count2 += 1;
						if (count2 < 2) {
							
						
						System.out.println("O N�mero de Candidatos do Sexo Masculino �: " + count2);
						}
		 				 		
							
		 				
		 				}
			
		}
		System.out.println("Idade M�dia dos Homens: " + Idade[1]);
		System.out.println("Idade M�dia das Mulheres com Experi�ncia: " + Idade[2]);
		System.out.println("");
		System.out.println("------------------------------------------------------------------------------");
		
		
	}
	
	
		
	
}
