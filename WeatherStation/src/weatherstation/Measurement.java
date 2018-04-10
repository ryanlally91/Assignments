package weatherstation;


public class Measurement {

	private int time;
	private Double temperature;

	//Creating constructor
	public Measurement(int time, Double temperature) {
		this.time = time;
		this.temperature = temperature;
	    
	}
	
	//Creating getters and setters
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public Double getTemperature() {
		return temperature;
	}
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

}
