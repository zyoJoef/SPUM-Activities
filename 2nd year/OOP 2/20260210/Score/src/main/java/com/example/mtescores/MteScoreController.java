package com.example.mtescores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.math.BigDecimal;
    
@Controller
public class MteScoreController {

    @Autowired
    private MteScoreRepository repository;  

    @GetMapping("/")
    public String showAllScores(Model model) {
        model.addAttribute("scores", repository.findAll());  
        return "score";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("score", new MteScore());
        return "add-score";
    }

    @PostMapping("/add")
    public String addScore(@ModelAttribute MteScore score) {
        if (score.getScore().compareTo(BigDecimal.valueOf(100)) > 0 || score.getScore().compareTo(BigDecimal.ZERO) < 0) {
            return "redirect:/add";  // Simple validation redirect
        }
        repository.save(score);  
        return "redirect:/";
    }
}
