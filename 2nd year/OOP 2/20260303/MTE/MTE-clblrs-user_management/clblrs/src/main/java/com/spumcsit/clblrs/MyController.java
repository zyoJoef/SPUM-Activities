package com.spumcsit.clblrs;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class MyController {
    
    @Autowired
    private UserRepository userRepo;
    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    // CREATE PAGE
    @GetMapping("/create")
    public String createPage(Model model){
        model.addAttribute("user", new Users());
        return "create";
    }
    
    @PostMapping("/submit")
    public String submitApplication(Users user) {
        Timestamp now = Timestamp.from(Instant.now());
        
        user.setCreatedAt(now);
        user.setUpdatedAt(now);
        userRepo.save(user);
        return "success";
    }

    // VIEW TABLE
    @GetMapping("/users")
    public String view_user(Model model){
        model.addAttribute("listUsers", userRepo.findAll());
        return "view";
    }
    
    @GetMapping("/users/{id}")
    public String view_specific_user(@PathVariable Long id, Model model) {
        Optional<Users> user = (Optional<Users>) userRepo.findById(id);
        if (user.isPresent()) {
            model.addAttribute("user", user.get());
            return "view_specific";
        }
        return "redirect:/users";
    }
    
    // VIEW Table
    @GetMapping("/users_table")
    public String view_table(Model model){
        model.addAttribute("listUsers", userRepo.findAll());
        return "view_table";
    }

    // UPDATE PAGE

    @GetMapping("/update")
    public String updateGetID(Model model, Users user) {
        model.addAttribute("user", user);
        return "update";
    }
    
    @PostMapping("/edit")
    public String edit(Users user, Model model, RedirectAttributes redirectAttributes) {
        Optional<Users> userOptional = (Optional<Users>) userRepo.findById(user.getId());
        if (userOptional.isPresent()) {
            Users editUser = userOptional.get();
            model.addAttribute("user", editUser);
            return "edit";
        }
        else {
            // Handle user not found - redirect or show error
            redirectAttributes.addFlashAttribute("message", "User is not found.");
            return "redirect:/view";
        }     
    }
    
    @PostMapping("/save")
    public String saveUser(Users user){
        Timestamp now = Timestamp.from(Instant.now());
        user.setUpdatedAt(now);
        userRepo.save(user);
        
        return "success";
    }
    
    @PostMapping("/update/{id}")
    public String updateResult(Users user, RedirectAttributes redirectAttributes) {
        Timestamp now = Timestamp.from(Instant.now());
        user.setUpdatedAt(now);
        userRepo.save(user);
        redirectAttributes.addFlashAttribute("message", "User #{user.getId()} successfully updated!");
        return "redirect:/view";
    }

    // DELETE USER
    // 1. Show the confirmation page
    @GetMapping("/confirm-delete/{id}")
    public String showDeleteConfirmation(@PathVariable Long id, Model model) {
        Optional<Users> user = (Optional<Users>) userRepo.findById(id);
        if (user.isPresent()) {
            model.addAttribute("user", user.get());
            return "delete";
        }
        return "redirect:/users";
    }
    @Autowired
    private JdbcTemplate jdbcTemplate; 

    @GetMapping("/delete/execute/{id}")
    public String executeDelete(@PathVariable Long id) {
        try {
            jdbcTemplate.update("DELETE FROM sessions WHERE user_id = ?", id);
            jdbcTemplate.update("DELETE FROM faces WHERE user_id = ?", id);
            userRepo.deleteById(id);
        }
        catch (DataAccessException e) {
        }
        return "redirect:/users?deleted=true"; 
    }
}
