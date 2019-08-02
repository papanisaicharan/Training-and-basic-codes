package springdb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentController {
	
	@Autowired
	StudentDao dao;
	
	@RequestMapping(value = "addstd",method = RequestMethod.GET)
	public String showAddStudentForm() {
		return "addstudent";
	}
	
	@RequestMapping(value = "addstd",method = RequestMethod.POST)
	public ModelAndView addStudent(@ModelAttribute("student") Student std ) {
		ModelAndView mav = new ModelAndView();
		String msg;
		int rows = dao.addstudent(std);
//		if(rows > 0)
//			msg = "record inserted";
//		else
//			msg = "record not inserted";
//		
//		mav.addObject("message",msg);
//		mav.addObject("std", std);
//		mav.setViewName("welcome");
		mav.setViewName("redirect:viewStd");
		return mav;
	}
	
	@RequestMapping("viewStd")
	public ModelAndView viewStudents() {
		ModelAndView mav = new ModelAndView();
		List<Student> list = dao.getStudents();
		mav.addObject("stdlist", list);
		mav.setViewName("viewStudents");
		return mav;
	}
	
	@RequestMapping("update")
	public ModelAndView updatestudent(@RequestParam("regno") String regno) {
		ModelAndView mav = new ModelAndView();
		//System.out.println("not :     "+regno);
		mav.addObject("regno1",regno);
		mav.setViewName("updatestudent");
		return mav;
	}
	
	@RequestMapping("updatestudent")
	public ModelAndView updatestudent(@ModelAttribute("student") Student std ) {
		ModelAndView mav = new ModelAndView();
		//System.out.println(std.getStdname() + std.getRegno() + std.getMarks());
		int rows = dao.updateStudent(std);
		String msg;
		if(rows > 0) {
			mav.setViewName("redirect:viewStd");
		}else {
			msg = "record not updated";
			mav.addObject("message",msg);
			mav.setViewName("status");
		}
		return mav;
	}

	@RequestMapping("delete")
	public ModelAndView deletestudent(@RequestParam("regno") String regno) {
		ModelAndView mav = new ModelAndView();
		///System.out.println("not :     "+regno);
		int rows = dao.deleteStudent(Integer.parseInt(regno));
		if(rows > 0) {
			mav.setViewName("redirect:viewStd");
		}else {
			String msg = "record not deleted";
			mav.addObject("message",msg);
			mav.setViewName("status");
		}
		return mav;
	}
}
