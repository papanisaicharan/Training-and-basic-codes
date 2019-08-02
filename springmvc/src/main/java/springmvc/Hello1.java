package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello1 {
	@RequestMapping("hello1")
	public String welcome() {
		return "wel";	
	}
}
