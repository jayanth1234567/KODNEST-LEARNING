
public class StudentApp {
	public static void doActivity(StudentActivites sa) {
		sa.attendclass();
		sa.study();
		sa.assignment();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhysicsStudent ps=new PhysicsStudent();
		ChemistryStudent cs=new ChemistryStudent();
		doActivity(ps);
		doActivity(cs);

	}

}
