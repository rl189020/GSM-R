package logic.map;

import java.util.List;

import mvc.map.GeoMsg;

public interface MapService {

	//��ѯ��ͼ�пɼ���վ���豸��Ϣ
	public List<GeoMsg> getGeoMsgWithBounds(float minX, float minY, float maxX, float maxY);
}
