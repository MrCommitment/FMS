package pl.coderslab.FMS.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.validation.Validator;

@Controller
public class ValidationController {

    @Autowired
    private Validator validator;
}

