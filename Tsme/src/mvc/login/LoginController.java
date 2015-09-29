package mvc.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.login.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import utils.ValidateCodeTools;

@Controller
public class LoginController {
	
	@Autowired
	@Qualifier("loginService")
	private LoginService loginService;

	@Autowired
	@RequestMapping("loginIndex")
	public ModelAndView loginIndex(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}
	
	// 验证码
	@RequestMapping("/checkNumberShow")
	public ModelAndView checkNumberShow() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("checkNumber");
		return mav;
	}
	
	@RequestMapping("/userLogin")
	public ModelAndView userLogin(LoginInfo info, HttpServletRequest request){
		ModelAndView mav = new ModelAndView();
		String msg = "right";
		if(!loginService.validUserLoginInfo(info)){
			msg="用户名或密码错误";
		}
		else{
			ValidateCodeTools validateCodeTools = new ValidateCodeTools();
			if(!validateCodeTools.check(info.getCheckNum(), request)){
				msg = "验证码错误";
			}
		}
		if(msg.equals("right")){
			mav.setViewName("redirect:/map/mapIndex");
		}
		else{
			mav.addObject("username", info.getUsername());
			mav.addObject("password", info.getPassword());
			mav.addObject("msg", msg);
			mav.setViewName("login");
		}
		return mav;
	}
}
