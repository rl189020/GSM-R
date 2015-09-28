package logic.map;

import java.util.List;

import mvc.map.GeoMsg;

public interface MapService {

	//查询地图中可见基站、设备信息
	public List<GeoMsg> getGeoMsgWithBounds(float minX, float minY, float maxX, float maxY);
}
