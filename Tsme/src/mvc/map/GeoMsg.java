package mvc.map;

//设备及基站地理信息查询结果
public class GeoMsg {

	//编号
	private String id;
	
	//名称
	private String name;
	
	//简介
	private String introduction;
	
	//经度
	public float LNG;
	
	//纬度
	public float LAT;
	
	//代表设备或基站
	public String type;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getIntroduction() {
		return introduction;
	}
	
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	
	public float getLNG() {
		return LNG;
	}
	
	public void setLNG(float LNG) {
		this.LNG = LNG;
	}
	
	public float getLAT() {
		return LAT;
	}
	
	public void setLAT(float LAT) {
		this.LAT =LAT;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
}
