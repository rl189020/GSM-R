package mvc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConfigController {

	@Autowired
	@RequestMapping("configIndex")
	public ModelAndView configIndex(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("device");
		return mav;
	}
}
