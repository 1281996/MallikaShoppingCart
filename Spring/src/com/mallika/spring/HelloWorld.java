package com.mallika.spring;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HelloWorld {
	
	@RequestMapping("/hello")
	public String printHello(ModelAndView model) {
		  model.addObject("message", "Hello Spring MVC Framework!");
	      return "hello";
	}
	
	/*@RequestMapping(method = RequestMethod.GET)public String printHello(ModelMap model) {*/
	    
}


/*import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/hello")
public class HelloController {
   @RequestMapping(method = RequestMethod.GET)public String printHello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return "hello";
   }
}*/