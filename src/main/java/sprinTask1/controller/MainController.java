package sprinTask1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import sprinTask1.db.DBManager;
import sprinTask1.db.Student;

import java.util.ArrayList;

@Controller
public class MainController {
    @GetMapping(value = "/")
    public String indexPage(Model model) {
        ArrayList<Student> students = DBManager.getStudents();
        model.addAttribute("students", students);
        return "main";
    }

    @PostMapping(value = "/add-student")
    public String addStudent(Student student) {
        DBManager.addStudents(student);
        return "redirect:/";
    }

    @GetMapping(value = "/add-student")
    public String getAddMovie() {
        return "add-student";
    }
}
