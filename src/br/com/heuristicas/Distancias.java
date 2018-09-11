package br.com.heuristicas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.entidades.CityPair;

public class Distancias {
	
	public static HashMap<CityPair, Integer> getDistances() {
		HashMap<CityPair, Integer> distances = new HashMap<>();
		File file = new File("C:/areaDeTrabalho/projetos/LendoDistanciaBucharest/src/br/com/files/distanciasLinhaReta.csv");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			List<String> cities = new ArrayList<>();

			String line = null;

			while ((line = br.readLine()) != null) {
				String[] columns = line.split(";");
				String city = columns[0];
				cities.add(city);
				distances.put(new CityPair(city, city), 0);
				//System.out.printf("Inserindo distancia entre %s e %s = %d%n", city, city, 0);
				for (int j = 1; j < columns.length; j++) {
					CityPair cityPair = new CityPair(city, cities.get(j - 1));
					Integer distance = Integer.parseInt(columns[j]);
					distances.put(cityPair, distance);
					/* System.out.printf("Inserindo distancia entre %s e %s = %d%n", cityPair.getCity1(),
							cityPair.getCity2(), distance);*/
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return distances;

	}
}
