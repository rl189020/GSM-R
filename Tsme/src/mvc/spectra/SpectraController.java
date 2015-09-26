package mvc.spectra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpectraController {
	
	@Autowired
	@RequestMapping("spectraIndex")
	public ModelAndView spectraIndex(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("detail");
		return mav;
	}
}
