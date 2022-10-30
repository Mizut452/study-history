package Mizut452.studyhistory;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

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

    @RequestMapping("/add")
    String addItem(@RequestParam("mailaddress") String mailaddress,
                   @RequestParam("username") String username,
                   @RequestParam("password") String password) {
        String id = UUID.randomUUID().toString().substring(0, 8);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        password = encoder.encode(password);

        UserList item = new UserList(id, mailaddress, username, password);
        dao.create(item);

        return "redirect:/userlist";
    }


}
