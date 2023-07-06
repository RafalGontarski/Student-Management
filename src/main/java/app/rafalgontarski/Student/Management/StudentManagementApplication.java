package app.rafalgontarski.Student.Management;

import app.rafalgontarski.Student.Management.entity.Student;
import app.rafalgontarski.Student.Management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Rafał", "Gontarski", "rafalgontarski.dev@gmail.com");
		studentRepository.save(student1);

		Student student2 = new Student("Roman", "Kowalski", "roman.kowalski@gmail.com");
		studentRepository.save(student2);

		Student student3 = new Student("Jan", "Kowalski", "jan.kowalski@gmail.com");
		studentRepository.save(student3);
	}
}
