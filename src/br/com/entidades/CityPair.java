package br.com.entidades;

public class CityPair {
	protected String city1;
	protected String city2;

	public String getCity1() {
		return city1;
	}

	public void setCity1(String city1) {
		this.city1 = city1;
	}

	public String getCity2() {
		return city2;
	}

	public void setCity2(String city2) {
		this.city2 = city2;
	}

	public CityPair(String city1, String city2) {
		this.city1 = city1;
		this.city2 = city2;
	}

	@Override
	public int hashCode() {
		return city1.hashCode() * city2.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CityPair other = (CityPair) obj;

		return city1.equalsIgnoreCase(other.city1) && city2.equalsIgnoreCase(other.city2)
				|| city1.equalsIgnoreCase(other.city2) && city2.equalsIgnoreCase(other.city1);

	}

}
