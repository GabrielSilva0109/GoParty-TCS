package go.party.tcs.controller;

import org.springframework.web.bind.annotation.GetMapping;
//TESTE
@org.springframework.stereotype.Controller
public class Controller {
    
    @GetMapping("/home")
    public String homePage(){
        return "home";
    }

    @GetMapping("/")
    public String redirectToHomePage() {
        return "redirect:/home";
    }

    
}
