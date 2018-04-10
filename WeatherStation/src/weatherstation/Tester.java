

package weatherstation;

import java.util.ArrayList;

public class Tester {


	//static ArrayList<Measurement> array1 = new ArrayList<Measurement>();


	public static void main(String[] args) {
		
		//Creating measurement objects to perform calculations on
		Measurement meas1 = new Measurement(2, 10.0);
		Measurement meas2 = new Measurement(3, 20.0);
		Measurement meas3 = new Measurement(4, 8.8);
		Measurement meas4 = new Measurement(5, 9.9);
		Measurement meas5 = new Measurement(6, 4.4);

		//Creating 2 Weather Stations
		WeatherStation station1 = new WeatherStation("Galway");
		WeatherStation station2 = new WeatherStation("Dublin");

		//Adding measurements to the weather stations
		station1.addMeasurement(meas1);
		station1.addMeasurement(meas2);
		station1.addMeasurement(meas3);
		station1.addMeasurement(meas4);
		station1.addMeasurement(meas5);

		System.out.println("The average temperature at " + station1.getCity() + " is " + station1.averageTemperature(2, 3));

	}

}
