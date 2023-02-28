package busbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import busbooking.dao.Admindao;
import busbooking.model.Admin;

@Controller
public class AdminContoller {

	@Autowired
	Admindao admindao;

	@RequestMapping(path = "/adminlogin", method = RequestMethod.POST)
	public String adminLogin(@ModelAttribute Admin admin, Model m) {
		int r = admindao.adminlogin(admin);
		if (r == 1) {
			return "admin_home";
		}
		return "login_error";
	}
}
