package com.example.azure;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Student {
	
	@Id
	//@GeneratedValue
	int sid;
	String sname;
	String sstream;
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sstream=" + sstream + "]";
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSstream() {
		return sstream;
	}
	public void setSstream(String sstream) {
		this.sstream = sstream;
	}


}
