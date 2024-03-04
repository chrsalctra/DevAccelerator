package com.ltp.globalsuperstore;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import java.util.List;
import java.util.ArrayList;
@Controller
public class StoreController {
    @GetMapping("/")
    public String getForm(Model model) {
        model.addAttribute("categories", Constants.CATEGORIES);
        model.addAttribute("item", new Item());
        return "form";
    }
    List<Item> items = new ArrayList<Item>();
    @PostMapping("/submitItem")
    public String submitForm(Item item){
        items.add(item);
        return "redirect:/inventory";
    }

    @GetMapping("/inventory")
    public String getInventory(Model model){
        model.addAttribute("items", items);
        return "inventory";
    }
}
