package com.application.SpringProject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @RequestMapping("/new_student")
    public String newStudent(Model model) {
        model.addAttribute("grades", "Grade");
        return "new_student";
    }

    @RequestMapping("/create_student")
    public String createStudent(@RequestParam(value="first_name") String firstName, String lastName, Grade grade, Model model) {
        Student student = new Student();

            student.setFirstName("Marshall");
            student.setLastName("Mathers");
            student.setGrade(Grade.Fifth);

        model.addAttribute("student", student);

        return "view_student";
    }
}
