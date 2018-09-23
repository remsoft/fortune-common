package com.rem.fortune.model;

public class Coa extends Model{
	private int l1AccountType;
	private int l2Branch;
	private int l3CustSupp;
	private int l4Division;
	private int l5Custom;
	private String coaCd;
	private String favorite;
	public int getL1AccountType() {
		return l1AccountType;
	}
	public void setL1AccountType(int l1AccountType) {
		this.l1AccountType = l1AccountType;
	}
	public int getL2Branch() {
		return l2Branch;
	}
	public void setL2Branch(int l2Branch) {
		this.l2Branch = l2Branch;
	}
	public int getL3CustSupp() {
		return l3CustSupp;
	}
	public void setL3CustSupp(int l3CustSupp) {
		this.l3CustSupp = l3CustSupp;
	}
	public int getL4Division() {
		return l4Division;
	}
	public void setL4Division(int l4Division) {
		this.l4Division = l4Division;
	}
	public int getL5Custom() {
		return l5Custom;
	}
	public void setL5Custom(int l5Custom) {
		this.l5Custom = l5Custom;
	}
	public String getCoaCd() {
		return coaCd;
	}
	public void setCoaCd(String coaCd) {
		this.coaCd = coaCd;
	}
	public String getFavorite() {
		return favorite;
	}
	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}
	@Override
	public String toString() {
		return super.toString()+" Coa [l1AccountType=" + l1AccountType + ", l2Branch=" + l2Branch + ", l3CustSupp=" + l3CustSupp
				+ ", l4Division=" + l4Division + ", l5Custom=" + l5Custom + ", coaCd=" + coaCd + ", favorite="
				+ favorite + "]";
	}
	
}
