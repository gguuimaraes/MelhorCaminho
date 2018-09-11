package br.com.start;

import java.util.Scanner;

import br.com.entidades.CityPair;
import br.com.heuristicas.Distancias;

public class DistanciaReta {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("*******\tDISTANCIA EM LINHA RETA ENTRE CIDADES ***");
		System.out.print("*\tDigite o nome da primeira cidade: ");
		String city1, city2;
		city1 = kb.nextLine();
		System.out.print("*\tDigite o nome da segunda cidade: ");
		city2 = kb.nextLine();
		CityPair cityPair = new CityPair(city1, city2);
		Integer distance = Distancias.getDistances().get(cityPair);
		System.out.printf("*\tA distancia em linha reta entre %s e %s é: %d km\n", city1, city2, distance);
		
	}
}
