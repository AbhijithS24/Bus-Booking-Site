package busbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import busbooking.dao.Userdao;
import busbooking.model.User;

@Controller
public class UserController {

	@Autowired
	Userdao userdao;

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("email") String email, @RequestParam("password") String password) {

		return "user_home";
	}

	@RequestMapping("/userregister")
	public String register() {
		return "user_register";
	}

	@RequestMapping(path = "/processregister", method = RequestMethod.POST)
	public String processregister(@ModelAttribute User user, Model m) {

		int r = userdao.insert(user);
		m.addAttribute("user", user);
		return "user_registered";
	}

	// Calls the intial login page
	@RequestMapping("/loginpage")
	public String loginpage() {
		return "login";
	}

	@RequestMapping(path = "/userlogin", method = RequestMethod.POST)
	public String userlogin(@RequestParam("email") String email, @RequestParam("password") String password, Model m) {
		int r = userdao.userlogin(email, password);
		if (r == 1) {
			return "user_home";
		}
		return "login_error";
	}

}
