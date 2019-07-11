package pl.coderslab.FMS.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.coderslab.FMS.model.User;
import pl.coderslab.FMS.repository.UserRepository;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String home(HttpSession httpSession, Model model) {
        if (httpSession.getAttribute("loggedUser") == null) {
//            return "redirect:/user/authentication";
            return "/authentication/start";

        }
        Long loggedUserId = (Long) httpSession.getAttribute("loggedUser");
        Optional<User> optionalUser = userRepository.findById(loggedUserId);

        model.addAttribute("user", optionalUser.get());

        return "mainMenu";
    }

    @ModelAttribute
    public void headerMessage(Model model) {
        model.addAttribute("headerMessage", "Welcome in FMS (Freight Management System)");
    }

    @ModelAttribute
    public void headerMessage2(Model model) {
        model.addAttribute("headerMessage2", "FMS (Freight Management System)");
    }

    //return to start.jsp

    @GetMapping("/backToStart")
    public String goStart() {
        return "/authentication/start";
    }

    //go to Main Menu --> Contact Menu

    @GetMapping("/goContactMenu")
    public String goContactsMenu() {
        return "/contacts/contactMenu";
    }

    // go to Main Menu --> History

    @GetMapping("/goHistory")
    public String goHistoryView() {
        return "/history/historyAll";
    }

    // go to Main Menu --> Add Load
}