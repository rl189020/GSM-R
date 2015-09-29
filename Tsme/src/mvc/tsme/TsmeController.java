package mvc.tsme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TsmeController {
	
	@Autowired
	@RequestMapping("tsmeIndex")
	public ModelAndView tsmeIndex(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("addData");
		return mav;
	}
}
