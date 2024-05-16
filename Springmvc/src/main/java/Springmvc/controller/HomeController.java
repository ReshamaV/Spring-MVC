package Springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("name", 101);
		/*List<String> li=new ArrayList<String>();
		li.add("Rahul");
		li.add("Reshama");
		li.add("Nisha");
		model.addAttribute("lists", li);*/
		System.out.println("this is home url");
		return "index";
	}
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("This is help controller");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name", "Reshama");
		modelAndView.setViewName("help");
		return modelAndView;
	}

}
