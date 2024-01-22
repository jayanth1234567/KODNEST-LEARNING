package abstractCar;

public class CarApp {

	public static void main(String[] args) {
		CarActivity a=new CarActivity();
		ElectricCar cv=new ElectricCar();
		PetrolCar p=new PetrolCar();
		DieselCar d=new DieselCar();
		a.activity(cv);
		a.activity(p);
		a.activity(d);
	}

}
