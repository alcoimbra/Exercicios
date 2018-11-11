package course;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program8 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		/*Modo de Adicoinar um Elemento
		 * atrav�s da Posi��o do Vetor*/
		list.add(2, "Marco");
		
		/*Mostrando o Tamanho da Lista*/
		System.out.println(list.size());
		
		for(String imp : list) {
			System.out.println(imp);
		}
		System.out.println("----------------------------------------");
		
		/*Removendo um Elemento da Lista*/
		/*list.remove("Anna");
		list.remove(1);*/
		
		/*Romevendo Elementos atrav�s de Predicados*/
		list.removeIf(x -> x.charAt(0) == 'M');

		for(String imp : list) {
			System.out.println(imp);
		}
		System.out.println("-----------------------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("-----------------------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String imp : result) {
			System.out.println(imp);
		}
		System.out.println("----------------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}
}