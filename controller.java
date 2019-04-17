package myfirstwebapplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
	@RequestMapping(value="/login")
	public String showLoginpage()
	{
		return "Login";
	}
	@RequestMapping(value="/register")
	public String method(Model m)
	{
		m.addAttribute("name", "aishu");
		return "Register";
	}
}