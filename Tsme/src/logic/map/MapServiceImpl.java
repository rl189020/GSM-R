package logic.map;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import mvc.map.GeoMsg;
import tsme.table.baseStation.DAO.BaseStationDAO;
import tsme.table.baseStation.bean.BASESTATION;
import tsme.table.bsLocation.DAO.BsLocationDAO;
import tsme.table.bsLocation.bean.BSLOCATION;

@Service("mapService")
public class MapServiceImpl implements MapService{

	@Autowired
	@Qualifier("baseStationDAO")
	BaseStationDAO baseStationDAO;
	
	@Autowired
	@Qualifier("bsLocationDAO")
	BsLocationDAO bsLocationDAO;
	
	//查询数据库获得地理信息
	public List<GeoMsg> getGeoMsgWithBounds(float minX, float minY, float maxX, float maxY) {
	
		List<GeoMsg> geoMsgs = new LinkedList<GeoMsg>();
		
		List<BSLOCATION> locations = bsLocationDAO.getBsLocationWithBounds(minX, minY, maxX, maxY);
		
		for(BSLOCATION location : locations) {
			BASESTATION baseStation = baseStationDAO.findBothById(location.getBase_station_id());
			GeoMsg geoMsg = new GeoMsg();
			geoMsg.setId(baseStation.getId());
			geoMsg.setIntroduction(baseStation.getIntroduction());
			geoMsg.setName(baseStation.getName());
			geoMsg.setLAT(location.getLAT());
			geoMsg.setLNG(location.getLNG());
			geoMsg.setType("BS");
			geoMsgs.add(geoMsg);
		}
		
		return geoMsgs;
	}
}
