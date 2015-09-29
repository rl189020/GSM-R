package mvc.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@Autowired
	@RequestMapping("loginIndex")
	public ModelAndView loginIndex(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}
}
