package springmvcboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class SampleController {
	
	@Autowired
	StudentDao dao;
	
	public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.trim().isEmpty())
            return false;
        return true;
    }
	
	@RequestMapping("/hello")  
    public String hello(){  
        return "Hello";  
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
	@RequestMapping("addstd")
	public String addEmployee(@ModelAttribute("student") Student std ) {
		return "addStudent";
	}
	@RequestMapping("addstudent")
	public ModelAndView addEmployeeExt(@ModelAttribute("student") Student std ) {
		ModelAndView mav = new ModelAndView();
		String msg;
		int rows = dao.addstudent(std);
		mav.setViewName("redirect:admin");
		return mav;
	}
	@RequestMapping("logout")
	public String logout() {
		return "login";
	}
}
