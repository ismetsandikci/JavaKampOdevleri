package Ders3Odev2;

public class InstructorManager extends UserManager{
	
	@Override
	public void add(User instructor) {
		System.out.println("E�itmen Eklendi: " + instructor.getFirstName() + " " + instructor.getLastName());
	}
	
	public void specialMethodInstructor() {
		System.out.println("E�itmene �zel metot �al��t�r�ld�");
	}
}
