package model2;

public class InternationalCD extends CD implements MyInterface{
	private String internationFeature;
	
	

	public InternationalCD() {
		super();
	}



	public InternationalCD(int id,String name,String internationFeature) {
		super(id,name);
		this.internationFeature = internationFeature;
	}



	public String getInternationFeature() {
		return internationFeature;
	}



	public void setInternationFeature(String internationFeature) {
		this.internationFeature = internationFeature;
	}



	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "Id: "+getId()+" Name: "+getName()+" International-Feacture: "+internationFeature;
	}

}
