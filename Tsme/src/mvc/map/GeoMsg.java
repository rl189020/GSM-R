package mvc.map;

//�豸����վ������Ϣ��ѯ���
public class GeoMsg {

	//���
	private String id;
	
	//����
	private String name;
	
	//���
	private String introduction;
	
	//����
	public float LNG;
	
	//γ��
	public float LAT;
	
	//�����豸���վ
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
