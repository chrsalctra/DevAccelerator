package com.ltp.gradesubmission;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
 
@Controller
public class GradeController {

    List<Grade> studentGrades = new ArrayList<>();
    @GetMapping("/")
    public String getForm(Model model, @RequestParam(required = false) String id) {
    int index = getGradeIndex(id);
    model.addAttribute("grade", getGradeIndex(id) == Constants.NOT_FOUND ? new Grade(): studentGrades.get(index) );
        return "form";
    }
    @PostMapping("/handleSubmit")
            public String submitForm(Grade grade){
                int index = getGradeIndex(grade.getId());
                if (index == -1000) {
                    studentGrades.add(grade);
                } else {
                    studentGrades.set(index, grade);
                }
                
                return "redirect:/grades"; // get request triggers below handler method
            }             
       
    @GetMapping("/grades")
    public String getGrades(Model model) {
        model.addAttribute("grades", studentGrades);
        return "grades";
    }

    public Integer getGradeIndex(String id) {
        for (int i = 0; i< studentGrades.size(); i++){
            if (studentGrades.get(i).getName().equals(id)) return i;
        }
        return Constants.NOT_FOUND;
    }
}
   