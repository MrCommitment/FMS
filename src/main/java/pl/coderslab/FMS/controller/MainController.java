package pl.coderslab.FMS.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class MainController {


    @GetMapping("/")
    public String home(HttpSession httpSession) {
        if (httpSession.getAttribute("loggedUser") == null) {
//            return "redirect:/user/authentication";
            return "/authentication/start";

        }
        return "home";

    }
}