package org.mz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String show(@ModelAttribute("user") User xyz) {
		//model.addAttribute(new User());
		System.out.println("show good");
		return "index";
	}
	
	@RequestMapping("/test")
	public String testUser(Model model) {
		List<User> users=new ArrayList<User>();
		users.add(new User("kk"));
		users.add(new User("MK"));
		users.add(new User("GK"));
		model.addAttribute("users",users);
		model.addAttribute("key","testing value");
		//model.addAttribute(new User());
		System.out.println("show");
		return "user";
	}

}
