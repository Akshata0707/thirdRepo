package collections;

import java.util.Comparator;

public class States {

	public static final Comparator<States> StateComparator = null;
	private String stateName;
	private Cities cities;
	
	public States() {
		
	}
	public States(String stateName, Cities cities) {
		super();
		this.stateName = stateName;
		this.cities = cities;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public Cities getCities() {
		return cities;
	}
	public void setCities(Cities cities) {
		this.cities = cities;
	}
	@Override
	public String toString() {
		return "States [stateName=" + stateName + ", cities=" + cities + "]";
	}
	
}
