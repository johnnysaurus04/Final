package com.project.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class MainController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/") //Takes form data and adds a new product
    public String addProduct(@RequestParam String name, @RequestParam String price, @RequestParam String description) {
        Product newProduct = new Product();
        newProduct.setName(name);
        newProduct.setPrice(price);
        newProduct.setDescription(description);
        productRepository.save(newProduct);
        return "redirect:/"; //Goes to main page
    }
    
    @GetMapping("/") //Main page where products are listed and added
    public String mainPage(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "index";
    }
    
    @GetMapping("/{id}") //Deletes product based on the ID
    public String deleteProduct(@PathVariable int id){
        productRepository.deleteById(id);
        return "redirect:/"; //Goes to main page
    }
    
}
