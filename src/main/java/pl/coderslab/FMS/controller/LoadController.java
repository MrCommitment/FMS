package pl.coderslab.FMS.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.FMS.model.Load;
import pl.coderslab.FMS.model.Place;
import pl.coderslab.FMS.model.Truck;
import pl.coderslab.FMS.model.dto.LoadInfoDTO;
import pl.coderslab.FMS.service.TourService;

@Controller
public class LoadController {

    @Autowired
    TourService tourService;


    @GetMapping("/addLoad")
    public String addLoad(Model model){

        model.addAttribute("loadInfo", new LoadInfoDTO());
        return "/load/addLoad";
    }

    @PostMapping("/addLoad")
    public String newLoad(@ModelAttribute LoadInfoDTO loadInfoDTO, Model model){

        tourService.createTour(loadInfoDTO);
        model.addAttribute("loadInfo", loadInfoDTO);
        return "/load/confirmation";
    }
}
