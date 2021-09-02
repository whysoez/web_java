package bt2;

public class City implements Comparable<City>{
	private String cityId;
	private String cityName;
	private boolean status;
	public City(String cityId, String cityName, boolean status) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.status = status;
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String toString() {
		return "City. cityId="+this.cityId+" - cityName="+this.cityName+" - Status="+this.status;
	}
	@Override
	public int compareTo(City o) {
		if (Integer.parseInt(this.cityId)>Integer.parseInt(o.cityId)) {
			return 1;
			}
		else if (Integer.parseInt(this.cityId)==Integer.parseInt(o.cityId)) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
}
