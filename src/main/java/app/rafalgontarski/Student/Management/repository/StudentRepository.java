package app.rafalgontarski.Student.Management.repository;

import app.rafalgontarski.Student.Management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
