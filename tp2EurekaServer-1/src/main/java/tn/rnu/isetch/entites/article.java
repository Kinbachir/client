package tn.rnu.isetch.entites;

public class article {
	private int id ;
	private String code;
	private String Designation;
	private double Prix_HT;
	private int 	TVA;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public double getPrix_HT() {
		return Prix_HT;
	}
	public void setPrix_HT(double prix_HT) {
		Prix_HT = prix_HT;
	}
	public int getTVA() {
		return TVA;
	}
	public void setTVA(int tVA) {
		TVA = tVA;
	}
	public int getId() {
		return id;
	}
	public article(String code, String designation, double prix_HT, int tVA) {
		this.code = code;
		Designation = designation;
		Prix_HT = prix_HT;
		TVA = tVA;
	}
	public article() {
	}
	@Override
	public String toString() {
		return "article [id=" + id + ", code=" + code + ", Designation=" + Designation + ", Prix_HT=" + Prix_HT
				+ ", TVA=" + TVA + "]";
	}
	
}
