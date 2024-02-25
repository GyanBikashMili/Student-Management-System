package org.spring.studentmanagement.Repository;

import org.spring.studentmanagement.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {



}
