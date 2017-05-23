package com.rajeev.domain;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.rajeev.model.Patient;

public class PatientSetMapper implements FieldSetMapper<Patient>{

	public Patient mapFieldSet(FieldSet fs) throws BindException {
		Patient rs = new Patient();
		rs.setDoctorname(fs.readString(0));
		rs.setMemberid(fs.readInt(1));
		rs.setPatientdisease(fs.readString(2));
		rs.setPatientpredianosisinfo(fs.readString(3));
		rs.setPatientmentalhealth(fs.readString(4));
		rs.setAge(fs.readInt(5));
		rs.setCigarsmoking(fs.readString(6));
		rs.setAlcohol(fs.readString(7));
		rs.setTreatmentstartdate(fs.readString(8));
		rs.setProviderId(fs.readString(9));
		rs.setEstimatedcost(fs.readString(10));
		rs.setGender(fs.readString(11));
		rs.setDescription(fs.readString(12));
		rs.setAbnormalsymptoms(fs.readString(13));
		rs.setPatienttype(fs.readString(14));
		rs.setPhysician(fs.readString(15));
		return rs;
	}

}
