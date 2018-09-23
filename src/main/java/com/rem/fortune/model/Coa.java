package com.rem.fortune.model;

import java.util.ArrayList;
import java.util.List;

public class Coa extends Model{
	private int l1AccountType;
	private int l2Branch;
	private int l3CustSupp;
	private int l4Division;
	private int l5Custom;
	private String coaCd;
	private String favorite;
	private String l1AccountTypName;
	private String l1AccountTypGrp;
	List<AccountType> accountTypes = new ArrayList<AccountType>();
	List<Branch> branches = new ArrayList<Branch>();
	List<CustomerSupplier> custSupps = new ArrayList<CustomerSupplier>();
	List<Division> divisions = new ArrayList<Division>();
	List<CoaCustomLevelN1> customFields1 = new ArrayList<CoaCustomLevelN1>(); 
	
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
	public String getL1AccountTypName() {
		return l1AccountTypName;
	}
	public void setL1AccountTypName(String l1AccountTypName) {
		this.l1AccountTypName = l1AccountTypName;
	}
	public String getL1AccountTypGrp() {
		return l1AccountTypGrp;
	}
	public void setL1AccountTypGrp(String l1AccountTypGrp) {
		this.l1AccountTypGrp = l1AccountTypGrp;
	}
	
	public List<AccountType> getAccountTypes() {
		return accountTypes;
	}
	public void setAccountTypes(List<AccountType> accountTypes) {
		this.accountTypes = accountTypes;
	}
	public List<Branch> getBranches() {
		return branches;
	}
	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}
	public List<CustomerSupplier> getCustSupps() {
		return custSupps;
	}
	public void setCustSupps(List<CustomerSupplier> custSupps) {
		this.custSupps = custSupps;
	}
	public List<Division> getDivisions() {
		return divisions;
	}
	public void setDivisions(List<Division> divisions) {
		this.divisions = divisions;
	}
	public List<CoaCustomLevelN1> getCustomFields1() {
		return customFields1;
	}
	public void setCustomFields1(List<CoaCustomLevelN1> customFields1) {
		this.customFields1 = customFields1;
	}
	@Override
	public String toString() {
		return super.toString()+ "Coa [l1AccountType=" + l1AccountType + ", l2Branch=" + l2Branch + ", l3CustSupp=" + l3CustSupp
				+ ", l4Division=" + l4Division + ", l5Custom=" + l5Custom + ", coaCd=" + coaCd + ", favorite="
				+ favorite + ", l1AccountTypName=" + l1AccountTypName + ", l1AccountTypGrp=" + l1AccountTypGrp + "]";
	}
	
	
}
