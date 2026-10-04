package Soa12.example.soa12.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Soa12.example.soa12.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}