package springmvcboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class SampleController {
	

	
	public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.trim().isEmpty())
            return false;
        return true;
    }
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}
	@RequestMapping("/admin")
	public ModelAndView adminpage(@RequestParam("user") String user,@RequestParam("password") String password) {
		if(user.equals("admin") && password.equals("admin")) {
			ModelAndView mav = new ModelAndView();
			mav.setViewName("admin");
			return mav;
		}else {
			ModelAndView mav = new ModelAndView();
			mav.setViewName("redirect:login");
			return mav;
		}
	}
	
	@RequestMapping("/addstd")
	public String addstd() {
		return "addstd";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(@RequestParam("regno") String regno,@RequestParam("user") String user,@RequestParam("marks") String marks) {
		return "addstd";
	}
	
	@RequestMapping("logout")
	public String logout() {
		return "login";
	}
}
