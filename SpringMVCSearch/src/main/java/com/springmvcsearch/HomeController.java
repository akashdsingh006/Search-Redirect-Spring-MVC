package com.springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String mainPage()
	{
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView homePage(@RequestParam(name = "searchbox")  String searchbox)
	{
		String url="https://www.google.com/search?q=";
		url=url+searchbox;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		
		return redirectView;
	}
}
