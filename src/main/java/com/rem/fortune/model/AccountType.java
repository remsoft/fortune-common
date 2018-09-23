package com.rem.fortune.model;

public class AccountType extends Model{
	private int classficationId;
	private int accountTypGrpid;
	private String accountTypGrpName;
	public int getClassficationId() {
		return classficationId;
	}
	public void setClassficationId(int classficationId) {
		this.classficationId = classficationId;
	}
	public int getAccountTypGrpid() {
		return accountTypGrpid;
	}
	public void setAccountTypGrpid(int accountTypGrpid) {
		this.accountTypGrpid = accountTypGrpid;
	}
	public String getAccountTypGrpName() {
		return accountTypGrpName;
	}
	public void setAccountTypGrpName(String accountTypGrpName) {
		this.accountTypGrpName = accountTypGrpName;
	}
	
}
