package weatherstation;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.function.Predicate;

public class WeatherStation {


	private Measurement meas;
	private String city;
	//An arrayList to store all the measurements
	ArrayList<Measurement> array = new ArrayList<Measurement>();

	public WeatherStation(String city) {
		this.city=city;
	}
	//Creating an add measurement method to add measurement info to our weather stations
	public void addMeasurement(Measurement measurement) {
		array.add(measurement);
	}

	public Double averageTemperature(int startTime, int endTime){

		//Using the functional Predicate interface
		Predicate<Measurement> allTemps = p -> p.getTime() >=startTime && p.getTime()<= endTime;// getting all temperatures within a specified range
		//Getting the total of all temperatures in the range

		Double totalTemp = array.stream()				//Calling the method stream() on the list of Temperatures returns a sequential object stream.
				.filter(allTemps)						//Filter the objetcs in our stream to match predicate objects (i.e. Temperatures within the specified range)
				.mapToDouble(p -> p.getTemperature())	//returns the stream as a double stream
				.sum();									//Add the Temperatures

		// Getting average of all the temperatures, using a stream
		Double averageTemp = array
				.stream()								//Calling the method stream() on the list of Temperatures returns a sequential object stream.
				.filter(allTemps)						//Filter the objetcs in our stream to match predicate objects (i.e. Temperatures within the specified range)
				.mapToDouble(p -> p.getTemperature())	//returns the stream as a double stream
				.average().getAsDouble();				//calculate the average of the Temperatures and return the result as a double value.
		return averageTemp;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}