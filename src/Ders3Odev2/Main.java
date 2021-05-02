package Ders3Odev2;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1, "İsmet", "Sandıkçı", "ismet@ismet.com", "12345", "İstanbul", "Card1");
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Student 2");
		student2.setLastName("Student 2");
		student2.setEmail("student@student"); 
		student2.setPassword("12345");
		student2.setAddress("Ankara");
		student2.setCardInfo("Card 3");
		
		StudentManager studentManager = new StudentManager();
		
		Student[] students = {student1, student2};
		
		for (Student student : students) {
			studentManager.add(student);
		}

		studentManager.update(student1);
		studentManager.update(student2);
		studentManager.delete(student1);
		studentManager.delete(student2);
		
		studentManager.specialMethodStudent();
		
		System.out.println("--------------------------------------------");
		
		Instructor instructor1 = new Instructor(3,"Instructor 1", "Instructor 1", "instructor@instructor", "12345", "Test Instructor");
		
		Instructor instructor2 = new Instructor();
		instructor2.setId(4);
		instructor2.setFirstName("Engin");
		instructor2.setLastName("Demiroğ");
		instructor2.setEmail("engin@engin");
		instructor2.setPassword("12345");
		instructor2.setAboutMe("Merhaba, ben Engin Demiroğ. MCT,PMP ve ITIL sertifikalarına sahibim");
		
		Instructor[] instructors = {instructor1, instructor2};
		
		InstructorManager instructorManager = new InstructorManager();
		
		for (Instructor instructor : instructors) {
			instructorManager.add(instructor);
			instructorManager.update(instructor);
			instructorManager.delete(instructor);
		}
		
		instructorManager.specialMethodInstructor();
		
		System.out.println("--------------------------------------------");
	}

}
