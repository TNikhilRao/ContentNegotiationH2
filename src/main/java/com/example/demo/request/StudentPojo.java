package com.example.demo.request;

public class StudentPojo {

	private Integer sId;
	private String sName;

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	@Override
	public String toString() {
		return "StudentPojo [sId=" + sId + ", sName=" + sName + "]";
	}

}
