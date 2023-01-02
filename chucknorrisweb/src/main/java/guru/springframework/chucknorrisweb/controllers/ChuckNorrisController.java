package guru.springframework.chucknorrisweb.controllers;

import guru.springframework.chucknorrisweb.services.ChuckNorrisService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ihor Sukalin on 01.01.2023
 *
 * @author : Ihor Sukalin
 * date : 01.01.2023
 * project : chuck-norris-for-actuator
 */
@Controller
public class ChuckNorrisController {

    private final ChuckNorrisService chuckNorrisService;

    public ChuckNorrisController(ChuckNorrisService chuckNorrisService) {
        this.chuckNorrisService = chuckNorrisService;
    }
    @RequestMapping({"/", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", chuckNorrisService.getJoke());
        return "index";
    }
}
