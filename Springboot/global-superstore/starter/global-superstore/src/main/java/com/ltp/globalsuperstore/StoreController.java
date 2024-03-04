package com.ltp.globalsuperstore;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.ui.Model;
import java.util.List;
import java.util.ArrayList;
@Controller
public class StoreController {
    List<Item> items = new ArrayList<Item>();
    @GetMapping("/")
    public String getForm(Model model, @RequestParam (required=false) String id) {
        int index= getIndex(id);
        model.addAttribute("categories", Constants.CATEGORIES);
        model.addAttribute("item", getIndex(id) !=0 ? items.get(index) : new Item());
        //bug: first item does not carry data over when updating
        return "form";
    }
    
    @PostMapping("/submitItem")
    public String submitForm(Item item, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("status", Constants.SUCCESS_STATUS);
        int index = getIndex(item.getId());
        if (item.getId() != null){
        if (index == 0){
            items.add(item);
        } else{
            items.set(getIndex(item.getId()), item);
        }      
        } return "redirect:/inventory";
    }

    @GetMapping("/inventory")
    public String getInventory(Model model){
        model.addAttribute("items", items);
        return "inventory";
    }
    public int getIndex(String id){
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) return i;
        }
        return 0;
    }
}
