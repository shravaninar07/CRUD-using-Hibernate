package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studrecord")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studid;
	private String sname;
	private String stream;
	@Column(name="panNo")
	private long addharNo;
	private long mobileno;

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public long getAddharNo() {
		return addharNo;
	}

	public void setAddharNo(long addharNo) {
		this.addharNo = addharNo;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public Student(int studid, String sname, String stream, long addharNo, long mobileno) {
		super();
		this.studid = studid;
		this.sname = sname;
		this.stream = stream;
		this.addharNo = addharNo;
		this.mobileno = mobileno;
	}

	public Student() {

	}

	@Override
	public String toString() {
		return "Student [studid=" + studid + ", sname=" + sname + ", stream=" + stream + ", addharNo=" + addharNo
				+ ", mobileno=" + mobileno + "]";
	}

}
