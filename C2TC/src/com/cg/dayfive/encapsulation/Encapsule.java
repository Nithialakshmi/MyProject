package com.cg.dayfive.encapsulation;

public class Encapsule {
	private String name;
	private int id;
	private String mailId;
	private long mobile;

	public Encapsule() {
		super();
		this.name = name;
		this.id = id;
		this.mailId = mailId;
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Encapsule [name=" + name + ", id=" + id + ", mailId=" + mailId + ", mobile=" + mobile + "]";
	}

}
