package com.junlun.holdem.Holdem.controller;


        import com.junlun.holdem.Holdem.Model.Card;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.HashMap;
        import java.util.LinkedList;
        import java.util.List;


@Controller
public class MainController {
    @RequestMapping("/hello")
    public String index() {
        return "hello";
    }

    @RequestMapping("/")
    public String create(@RequestParam(value = "suits", required = false) Integer suits,
                         @RequestParam(value = "number", required = false) Integer number,
                         @RequestParam(value = "who", required = false) Integer who,
                         Model model) {


        model.addAttribute("card", new Card(suits, number));
        return "home";
    }
}
