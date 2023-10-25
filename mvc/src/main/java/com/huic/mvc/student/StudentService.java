package com.huic.mvc.student;

import com.huic.mvc.student.data.StudentEntity;
import com.huic.mvc.student.data.StudentRepository;
import com.huic.mvc.student.dto.Student;
import com.huic.mvc.student.dto.StudentMutation;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> findAll() {
        return Streamable.of(repository.findAll()).map(se -> new Student(se)).toList();
    }

    public Student create(StudentMutation studentMutation) {
        return new Student(repository.save(studentMutation.toEntity()));
    }

    public Student edit(long id, StudentMutation studentMutation) {
        StudentEntity entity = studentMutation.toEntity();
        entity.setId(id);
        return new Student(repository.save(entity));
    }

    public void delete(long id) {
        repository.deleteById(id);
    }


    public Student findById(long id) {
        Student student = new Student(repository.findById(id).get());
        return student;
    }
}
