package pl.coderslab.FMS.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    @GetMapping("/addLoad")
    public String addLoad() {
        return "/load/addLoad";
    }
}