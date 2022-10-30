package Mizut452.studyhistory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/createaccount")
    public String createAccount() {
        return "createAccount";
    }

}
