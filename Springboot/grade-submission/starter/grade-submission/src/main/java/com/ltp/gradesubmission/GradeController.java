package com.ltp.gradesubmission;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.*;

@Controller
public class GradeController {

    // List<Grade> studentGrades = new ArrayList<>(); --> causes loop generation issue (repeats)
    // List<Grade> studentGrades = Arrays.asList(
    //     new Grade("Harry", "Potions", "C-"),
    //     new Grade("Chris", "Arithmacy", "A-"),
    //     new Grade("Harry", "Charms", "B+")
    // ); //hard coded data
    //for the form:
    List<Grade> studentGrades = new ArrayList<>();
    @GetMapping("/")
    public String gradeForm(Model model) {
        model.addAttribute("grade", new Grade());
        return "form";
    }
    @PostMapping("/handleSubmit")
            public String submitForm(Grade grade){
                //System.out.println(grade);
                studentGrades.add(grade);
                return "redirect:/grades"; // get request triggers below handler method
            }
    
    @GetMapping("/grades")
    public String getGrades(Model model) {
        model.addAttribute("grades", studentGrades);
        // Grade grade = new Grade("Nevil", "Potions","C-" );
        //model.addAttribute("grade", grade);
        return "grades";
    }
}
