package com.spring.test.springtest;

public class Patient {
	private int patient_id;
	private String patient_name;
	private int patient_national_id;
	private Adress adress;

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public void onCreate()
	{
		System.out.println(this);
	}
	
	public void onDistroy()
	{
		System.out.println("patient is Distroyed!!");
	}
	
	public Patient() {

	}

	public Patient(int patient_id, String patient_name) {

		this.patient_id = patient_id;
		this.patient_name = patient_name;
	}

	public int getPatient_national_id() {
		return patient_national_id;
	}

	public void setPatient_national_id(int patient_national_id) {
		this.patient_national_id = patient_national_id;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public String toString() {
		return "Patient Id Is : " + patient_id + "\n" + "Patient Name : " + patient_name + "\n"
				+ "patient national id : " + patient_national_id +"\n" + "Patient Adress\n " + adress;

	}

	void speak() {
		System.out.println("help me !!");
	}

}
