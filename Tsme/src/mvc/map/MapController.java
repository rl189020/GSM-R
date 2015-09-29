package mvc.map;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import logic.map.MapService;
import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MapController {
	
	@Autowired
	@Qualifier("mapService")
	MapService mapService;
	
	@Autowired
	@RequestMapping("mapIndex")
	public ModelAndView mapIndex(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("displayAll");
		return mav;
	}
	
	@RequestMapping("getGeoMsg")
	public void getGeoMsg(@Valid GeoQueryPara geoQueryPara, HttpServletResponse res){
		List<GeoMsg> geoMsgs = mapService.getGeoMsgWithBounds(geoQueryPara.getMinX(), geoQueryPara.getMinY(), geoQueryPara.getMaxX(), geoQueryPara.getMaxY());
		JSONArray array = JSONArray.fromObject(geoMsgs);
		res.setContentType("text/json;charset=UTF-8");
		res.setCharacterEncoding("UTF-8");
		PrintWriter writer;
		try {
			writer = res.getWriter();
			String str = array.toString();
			writer.print(str);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
