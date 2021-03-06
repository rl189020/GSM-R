package logic.login;

import java.util.List;

import mvc.login.LoginInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import tsme.table.supervisor.DAO.SupervisorDAO;
import tsme.table.supervisor.bean.SUPERVISOR;

@Service("loginService")
public class LoginServiceImpl implements LoginService{

	@Autowired
	@Qualifier("supervisorDAO")
	private SupervisorDAO supervisorDAO;
	@Override
	public boolean validUserLoginInfo(LoginInfo info) {

		String sql = "SELECT * FROM supervisor WHERE username='" + info.getUsername() + "' AND password='"
				+ info.getPassword() + "'";
		List<SUPERVISOR> num = (List<SUPERVISOR>) supervisorDAO.findByQuery(sql, SUPERVISOR.class);
		if(num.size() > 0){
			return true;
		}
		else{
			return false;
		}
	}

}
