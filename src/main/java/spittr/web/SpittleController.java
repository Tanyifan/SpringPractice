package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spittr.Spittle;
import spittr.data.SpittleRepository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author TanYf.
 * @project
 * @illu
 * @date 2018/11/13
 */
@Controller
@Service
@RequestMapping("/spittles")
public class SpittleController {
    @Resource
    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Spittle> spittles( @RequestParam(value = "max",defaultValue = "238900") long max,
            @RequestParam(value = "count",defaultValue = "20") int count){
        return spittleRepository.findSpittles(max,count);
    }
//    public List<Spittle> spittles(){
//        return spittleRepository.findSpittles(Long.MAX_VALUE,20);
//    }
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String showSpittle(@RequestParam(value = "spittle_id") long spittleId,Model model){
        model.addAttribute(spittleRepository.findOne(spittleId));
        return "spittle";
    }

    @RequestMapping(value = "/{spittleId}", method = RequestMethod.GET)
    public String spittle(@PathVariable(value = "spittleId") long spittleId, Model model){
        model.addAttribute(spittleRepository.findOne(spittleId));
        return "spittle";
    }
}
