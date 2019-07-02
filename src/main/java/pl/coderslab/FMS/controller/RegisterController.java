package pl.coderslab.FMS.controller;


import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.FMS.entity.User;
import pl.coderslab.FMS.repository.UserRepository;

@Controller
public class RegisterController {

    @Autowired
    private UserRepository userRepository;

    //tworzenie nowego usera

    @GetMapping("/user/register/add")
    public String add(Model model){
        model.addAttribute("user", new User());
        return "user/register/add";


    }
    @PostMapping("/user/register/add")
    public String add(@ModelAttribute User user){
        String hashedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashedPassword);
        userRepository.save(user);
        return "redirect:/user/authentication";
    }

}
