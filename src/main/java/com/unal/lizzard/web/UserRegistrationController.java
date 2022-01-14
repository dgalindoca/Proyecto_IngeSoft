package com.unal.lizzard.web;



import com.unal.lizzard.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller

@RequestMapping("/registration")
public class UserRegistrationController {


    private UserService userService;
    public UserRegistrationController(UserService userService){
        super();
        this.userService=userService;
    }


    @PostMapping
    public String registerUserAccount (@ModelAttribute ("user") UserRegistrationDto registrationDto){


        userService.save(registrationDto);
        return "redirect:/registration?success";

    }
    @GetMapping
    public String showRegistrationForm(){
        return "registration";
    }


    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return  new UserRegistrationDto();
    }
}
