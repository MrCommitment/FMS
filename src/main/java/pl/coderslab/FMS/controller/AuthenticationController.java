package pl.coderslab.FMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.FMS.ViewMode;
import pl.coderslab.FMS.model.User;
import pl.coderslab.FMS.service.AuthenticationService;

import javax.servlet.http.HttpSession;

@Controller
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/user/authentication")
    public String login(Model model){
        model.addAttribute("viewMode", new ViewMode());
        return "authentication/login";

    }

    @PostMapping("/user/authentication")
    public String login(@ModelAttribute ViewMode viewMode, HttpSession httpSession){
        if ("register".equals(viewMode.getAction())){
            return "redirect:/user/register/add";
        }
        if ("login".equals(viewMode.getAction())) {
            if (authenticationService.givenEmailExistInDatabase(viewMode.getEmail())){
                User user = authenticationService.authenticate(viewMode.getEmail(),viewMode.getPassword());
                if (user !=null){
                    httpSession.setAttribute("loggedUser",user.getId());
                    return "redirect:/";
                }else {
                    return "authentication/login";

                }
            }else {
                return "authentication/login";

            }
        }
        return "authentication/login";

    }


}
