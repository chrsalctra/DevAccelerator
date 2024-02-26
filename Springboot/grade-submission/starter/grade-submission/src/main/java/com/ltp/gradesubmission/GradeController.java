package com.ltp.gradesubmission;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;

@Controller
public class GradeController {

    // List<Grade> studentGrades = new ArrayList<>(); --> causes loop generation issue (repeats)
    List<Grade> studentGrades = Arrays.asList(
        new Grade("Harry", "Potions", "C-"),
        new Grade("Chris", "Arithmacy", "A-"),
        new Grade("Harry", "Charms", "B+")
    );
    @GetMapping("/")
    public String gradeForm(Model model) {
        model.addAttribute("grade", new Grade());
        return "form";
    }
    @GetMapping("/grades")
    public String getGrades(Model model) {
        model.addAttribute("grades", studentGrades);
        // Grade grade = new Grade("Nevil", "Potions","C-" );
        //model.addAttribute("grade", grade);
        return "grades";
    }
}
