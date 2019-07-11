package pl.coderslab.FMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.coderslab.FMS.ContactsViewMode;
import pl.coderslab.FMS.model.Contacts;
import pl.coderslab.FMS.repository.ContactRepository;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;


    //wyświetlanie Listy wszystkich kontaktów

    @ModelAttribute("allContacts")
    public List<Contacts> findAll(@ModelAttribute ContactsViewMode contactsViewMode) {
        if("all".equals(contactsViewMode.getSearchMode())) {
            return contactRepository.findAll();
        }
        if("companyName".equals(contactsViewMode.getSearchMode())) {
            return contactRepository.findByCompanyName(contactsViewMode.getCompanyNameSearch());
        }
        if("email".equals(contactsViewMode.getSearchMode())) {
            return contactRepository.findByEmail(contactsViewMode.getEmailSearch());
        }
        return new ArrayList<>();
    }

    //tworzenie nowego kontaktu

    @GetMapping("/contact/addNew")
    public String add(Model model){
        model.addAttribute("contact", new Contacts());
        return "/contacts/add";

    }
    @PostMapping("/contact/addNew")
    public String addPost(@ModelAttribute @Valid Contacts contacts, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "/contacts/add";
        }
        contactRepository.save(contacts);
        return "redirect:/contacts/contactList";
    }

    //wyswietlanie wszystkich

    @GetMapping("/all")
    public String viewAll(Model model) {
        List<Contacts> contacts = contactRepository.findAll();
        model.addAttribute("contacts", contacts);
        return "contacts/contactList";
    }

    @PostMapping("/all")
    public ModelAndView postAction(@ModelAttribute ContactsViewMode contactsViewMode, ModelMap modelMap) {
        modelMap.addAttribute("ContactsId", contactsViewMode.getObjectId());
        if ("edit".equals(contactsViewMode.getMode())) {
            return new ModelAndView("redirect:/contacts/edit", modelMap);
        }
        if ("remove".equals(contactsViewMode.getMode())) {
            return new ModelAndView("redirect:/contacts/remove", modelMap);
        }
        return new ModelAndView("/contacts/contactList");
    }

    //usuwanie kontatu

    @GetMapping("/remove")
    public String removeContact(@ModelAttribute("contactId") long id, Model model) {
        model.addAttribute("contacts", contactRepository.findById(id).get());
        return "contacts/remove";
    }

    @PostMapping("/remove")
    public String removeContactPost(@ModelAttribute Contacts contacts) {
        contactRepository.delete(contacts);
        return "redirect:/contacts/all";
    }

    //edytowanie kontaktu

    @GetMapping("/edit")
    public String editContact(@ModelAttribute("contactId") long id, Model model) {
        model.addAttribute("contacts", contactRepository.findById(id).get());
        return "contacts/add";
    }

    @PostMapping("/edit")
    public String editContactPost(@ModelAttribute @Valid Contacts contacts, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "contacts/add";
        }
        contactRepository.save(contacts);
        return "redirect:/contacts/all";
    }

    //powrot do start.jsp

    @GetMapping("/start")
    public String goStart() {
        return "redirect:/";
    }

    //przejscie z ContactMenu do Main-Menu


    @GetMapping("/goMenu")
    public String goToMenu() {
        return "mainMenu";
    }

    @GetMapping("/goAdd")
    public String addContact(Model model){
        model.addAttribute("contacts", new Contacts());
        return "contacts/add";
    }

    @PostMapping("/goAdd")
    public String newContact(@ModelAttribute Contacts contacts){
        contactRepository.save(contacts);
        return "/contacts/contactMenu";
    }

}
