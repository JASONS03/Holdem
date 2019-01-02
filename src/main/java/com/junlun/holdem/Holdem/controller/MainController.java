package com.junlun.holdem.Holdem.controller;


        import com.junlun.holdem.Holdem.Model.Card;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.HashMap;


@Controller
public class MainController {
    @RequestMapping("/hello")
    public String index() {
        return "hello";
    }

    @RequestMapping("/")
    public String create(@RequestParam(value = "suits", required = false) String suits,
                         @RequestParam(value = "number", required = false) String number,
                         Model model) {
        Card card = new Card(suits, number);

        model.addAttribute(card);
        return "home";
    }
}
