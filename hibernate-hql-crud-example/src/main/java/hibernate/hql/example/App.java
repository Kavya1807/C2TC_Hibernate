package hibernate.hql.example;

import java.util.List;
import hibernate.hql.example.dao.StudentDao;
import hibernate.hql.example.entity.Student;

public class App {
	public static void main(String[] args) {

		StudentDao studentDao = new StudentDao();

		// create student
//		 Student student = new Student("preethi", "sharma", "pree@yahoo.com");
//		 studentDao.savedStudent(student);

//		// insert student
//		studentDao.insertStudent();

//		// update student
//		Student student1 = new Student("Adithya", "Arun", "AAgroups@gmail.com");
//		studentDao.updateStudent(student1);

		// get students

		List<Student> students = studentDao.getStudents();

		students.forEach(s -> System.out.println(s.getId()+": "+s.getFirstName()+" "+s.getLastName()));
		

		// or	
//		List<Student> students = studentDao.getStudents();		
//		for(Student s: students) {			
//			System.out.println(s.getFirstName()+"  "+s.getLastName());			
//		}

		
		// get single student
//		Student student2 = studentDao.getStudent(2); 
//		System.out.println(student2.getFirstName()+"  "+student2.getLastName());

		// delete student 
	//	studentDao.deleteStudent(1);

	}
}