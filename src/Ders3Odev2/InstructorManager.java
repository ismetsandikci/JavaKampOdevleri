package Ders3Odev2;

public class InstructorManager extends UserManager{
	
	@Override
	public void add(User instructor) {
		System.out.println("Eðitmen Eklendi: " + instructor.getFirstName() + " " + instructor.getLastName());
	}
	
	public void specialMethodInstructor() {
		System.out.println("Eðitmene özel metot çalýþtýrýldý");
	}
}
