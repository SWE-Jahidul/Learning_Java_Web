package com.spring.test.springtest;

public class Adress {
	private String streat;
	private String zip_code;

	public Adress() {

	}

	public Adress(String streat, String zip_code) {

		this.streat = streat;
		this.zip_code = zip_code;
	}

	public String getStreat() {
		return streat;
	}

	public void setStreat(String streat) {
		this.streat = streat;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	
	public String toString() {
		return "Patient Streat Is : " + streat + "\n"
				+ "patient Zip Code : " +zip_code;

	}
	
	
	
}
