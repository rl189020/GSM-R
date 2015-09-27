package mvc.map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MapController {
	
	@Autowired
	@RequestMapping("mapIndex")
	public ModelAndView mapIndex(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("displayAll");
		return mav;
	}
}
