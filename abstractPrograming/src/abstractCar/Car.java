package abstractCar;

abstract public class Car {
	public void start() {
		System.out.println("start the car ");
	}
	public void stop() {
		System.out.println("stop the car");
	}
	public abstract void refuel();
}