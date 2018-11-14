package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author TanYf.
 * @project
 * @illu
 * @date 2018/11/13
 */
@Controller
@RequestMapping({"/","/homePage"})
public class HomeController {
    @RequestMapping(method = GET)
    public String home(){
         return "home";
    }

}
