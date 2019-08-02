package springmvc;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@RequestMapping("hello")
	public String welcome() {
		return "welcome";	
	}
	@RequestMapping("display")
	public String display() {
		return "display";
	}
	@RequestMapping("")
	public String index() {
		return "index";
	}
	
	@RequestMapping("login")
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping("checkuser")
	public String validate(@RequestParam("user") String username,@RequestParam("password") String password) {
		if(username.equals("admin") && password.equals("admin")) {
			return "display";
		}else {
			return "login";
		}
	}
}
