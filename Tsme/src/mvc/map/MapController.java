package mvc.map;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import logic.map.MapService;

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
	@ResponseBody
	public List<GeoMsg> getGeoMsg(@Valid GeoQueryPara geoQueryPara){
		List<GeoMsg> geoMsgs = mapService.getGeoMsgWithBounds(geoQueryPara.getMinX(), geoQueryPara.getMinY(), geoQueryPara.getMaxX(), geoQueryPara.getMaxY());
		return geoMsgs;
	}
}
