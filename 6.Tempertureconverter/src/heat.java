import java.util.Scanner;

public class heat {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double f=scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		double celsius=temperatureConverter.convertFahrenheitToCelsius(f);
		System.out.println(celsius);

	}

}
