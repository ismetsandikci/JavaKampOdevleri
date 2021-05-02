package Ders3Odev2;

public class StudentManager extends UserManager{
	
	@Override
	public void add(User student) {
		System.out.println("Öðrenci Eklendi: " + student.getFirstName() + " " + student.getLastName());
	}
	
	public void specialMethodStudent() {
		System.out.println("Öðrenciye özel metot çalýþtýrýldý");
	}
	
}
