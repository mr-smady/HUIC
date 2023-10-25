package com.huic.mvc.student;

import com.huic.mvc.student.dto.Student;
import com.huic.mvc.student.dto.StudentMutation;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentsController {

    private final StudentService service;

    public StudentsController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("students", service.findAll());
        return "student_index";
    }

    @GetMapping("create")
    public String create(Model model) {
        StudentMutation studentMutation = new StudentMutation();
        studentMutation.setAge(6);
        model.addAttribute("student", studentMutation);
        return "student_create";
    }

    @PostMapping(value = "/create")
    public String create(StudentMutation studentMutation) {
        service.create(studentMutation);
        return "redirect:/students";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable long id, Model model) {
        Student student = service.findById(id);
        model.addAttribute("student", student);
        return "student_edit";
    }

    @PostMapping(value = "/edit/{id}")
    public String edit(@PathVariable long id, StudentMutation studentMutation) {
        service.edit(id, studentMutation);
        return "redirect:/students";
    }

}
