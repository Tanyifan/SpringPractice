package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spittr.Spitter;
import spittr.data.SpitterRepository;

import javax.annotation.Resource;
import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author TanYf.
 * @project
 * @illu
 * @date 2018/11/14
 */
@Controller
@Service
@RequestMapping("/spitter")
public class SpitterController {
    @Resource
    private SpitterRepository spitterRepository;

    public SpitterController() {
    }

    @Autowired
    public SpitterController(SpitterRepository spitterRepository) {
        this.spitterRepository = spitterRepository;
    }

    @RequestMapping(value = "/register",method = GET)
    public String showRegistrationForm(Model model){
        model.addAttribute(new Spitter());
        return "registerForm";
    }

    @RequestMapping(value = "/register",method = POST)
    public String processRegistration(@Valid Spitter spitter, Errors errors){
        if(errors.hasErrors()){
            return "registerForm";
        }
        spitterRepository.save(spitter);
        return "redirect:/spitter/"+spitter.getUserName();
    }

    @RequestMapping(value = "/{userName}",method = GET)
    public String showSpitterProfile(@PathVariable String userName, Model model){
        Spitter spitter = spitterRepository.findByUsername(userName);
        model.addAttribute(spitter);
        return "profile";
    }
}
