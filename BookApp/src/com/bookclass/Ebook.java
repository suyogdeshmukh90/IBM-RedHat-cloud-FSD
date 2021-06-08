package com.bookclass;

public class Ebook extends Book {
	private String downloadSite;
	private double sizeMb;
	public Ebook() {
		super();
	}
	public Ebook(String authorName, double costPrice, double salePrice, String title, int pages,String downloadSite, double sizeMb) {
		super(authorName, costPrice, salePrice, title, pages);
		this.downloadSite = downloadSite;
		this.sizeMb = sizeMb;
	}
	public String getDownloadSite() {
		return downloadSite;
	}
	public void setDownloadSite(String downloadSite) {
		this.downloadSite = downloadSite;
	}
	public double getSizeMb() {
		return sizeMb;
	}
	public void setSizeMb(double sizeMb) {
		this.sizeMb = sizeMb;
	}
	
//	@Override
//	public String getDetails()
//	{
//		return super.getDetails()+"Download Site: "+getDownloadSite()+"SizeMb: "+getSizeMb();
//	}
	public double getPageSize()
	{
		double psize;
		psize = getSizeMb()/super.getPages();
		return psize;
	}
	@Override
	public String getTitle()
	{
		return super.getTitle();
	}
	@Override
	public double getTax()
	{
		return super.getTax();
	}

}
