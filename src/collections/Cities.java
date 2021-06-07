package collections;

public class Cities implements Comparable<Cities> {

	private String cityName;
	private int population;

	public Cities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cities(String cityName, int population) {
		super();
		this.cityName = cityName;
		this.population = population;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Cities [cityName=" + cityName + ", population=" + population + "]";
	}

	@Override
	public int compareTo(Cities o) {
		if (this.population > o.population) {
			return 1;
		} else if (this.population <o.population) {
			return -1;
		}
		return 0;

	}
	

}
