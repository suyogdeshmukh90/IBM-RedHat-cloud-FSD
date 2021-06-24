package model2;

public class SpecialCD extends CD implements MyInterface{
	private String specialFeature;

	public SpecialCD() {
		super();
	}

	public SpecialCD(int id,String name,String specialFeature) {
		super(id,name);
		this.specialFeature = specialFeature;
	}

	public String getSpecialFeature() {
		return specialFeature;
	}

	public void setSpecialFeature(String specialFeature) {
		this.specialFeature = specialFeature;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "Id: "+getId()+" Name: "+getName()+" Special-Feacture: "+specialFeature;
	}
	

}
