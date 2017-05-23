package com.rajeev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;


@Entity
@Table(name = "patient")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	@Column(name="doctorname",length=5000)
	public String doctorname;
	public int memberid;
	
	
	public String getDoctorname() {
		return doctorname;
	}

	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}

	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public String getPatientdisease() {
		return patientdisease;
	}
	public void setPatientdisease(String patientdisease) {
		this.patientdisease = patientdisease;
	}
	public String getPatientpredianosisinfo() {
		return patientpredianosisinfo;
	}
	public void setPatientpredianosisinfo(String patientpredianosisinfo) {
		this.patientpredianosisinfo = patientpredianosisinfo;
	}
	public String getPatientmentalhealth() {
		return patientmentalhealth;
	}
	public void setPatientmentalhealth(String patientmentalhealth) {
		this.patientmentalhealth = patientmentalhealth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCigarsmoking() {
		return cigarsmoking;
	}
	public void setCigarsmoking(String cigarsmoking) {
		this.cigarsmoking = cigarsmoking;
	}
	public String getAlcohol() {
		return alcohol;
	}
	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}
	public String patientdisease;
	public String patientpredianosisinfo;
	public String patientmentalhealth;
	public int age;
	public String cigarsmoking;
	public String alcohol;
	public String treatmentstartdate;
	public String getTreatmentstartdate() {
		return treatmentstartdate;
	}
	public void setTreatmentstartdate(String treatmentstartdate) {
		this.treatmentstartdate = treatmentstartdate;
	}
	public String getProviderId() {
		return providerId;
	}
	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	public String getEstimatedcost() {
		return estimatedcost;
	}
	public void setEstimatedcost(String estimatedcost) {
		this.estimatedcost = estimatedcost;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAbnormalsymptoms() {
		return abnormalsymptoms;
	}
	public void setAbnormalsymptoms(String abnormalsymptoms) {
		this.abnormalsymptoms = abnormalsymptoms;
	}
	public String getPatienttype() {
		return patienttype;
	}
	public void setPatienttype(String patienttype) {
		this.patienttype = patienttype;
	}
	public String getPhysician() {
		return physician;
	}
	public void setPhysician(String physician) {
		this.physician = physician;
	}
	public String providerId;
	public String estimatedcost;
	public String gender;
	public String description;
	public String abnormalsymptoms;
	public String patienttype;
	public String physician;
	
	
	
	
	

}
