package Ders3Odev2;

public class StudentManager extends UserManager{
	
	@Override
	public void add(User student) {
		System.out.println("��renci Eklendi: " + student.getFirstName() + " " + student.getLastName());
	}
	
	public void specialMethodStudent() {
		System.out.println("��renciye �zel metot �al��t�r�ld�");
	}
	
}
