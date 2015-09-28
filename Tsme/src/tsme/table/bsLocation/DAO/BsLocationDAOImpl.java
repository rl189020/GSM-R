package tsme.table.bsLocation.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import tsme.DAO.mainDAOPractice.TsmeMainDAOPracticeImpl;
import tsme.table.bsLocation.bean.BSLOCATION;

@Repository("bsLocationDAO")
public class BsLocationDAOImpl extends TsmeMainDAOPracticeImpl<BSLOCATION> implements BsLocationDAO{

	@SuppressWarnings("unchecked")
	public List<BSLOCATION> getBsLocationWithBounds(float minX, float minY, float maxX, float maxY) {
	
		String sql = "SELECT base_station_id, LNG, LAT FROM BSLOCATION where LNG > " + minX
					+ " AND LNG < " + maxX
					+ " AND LAT > " + minY 
					+ " AND LAT < " + maxY;
		return (List<BSLOCATION>) this.findByQuery(sql, BSLOCATION.class);
	}
}
