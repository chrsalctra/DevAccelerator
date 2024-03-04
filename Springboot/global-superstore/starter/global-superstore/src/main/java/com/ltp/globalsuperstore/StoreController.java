package com.ltp.globalsuperstore;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class StoreController {
    @GetMapping("/")
    public String getForm(Model model) {
        model.addAttribute("categories", Constants.CATEGORIES);
        return "form";
    }
    
}
