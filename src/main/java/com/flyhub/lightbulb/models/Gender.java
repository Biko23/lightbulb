package com.flyhub.lightbulb.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Table(name = "admin_lookup_gender")
public class Gender {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="gender_id")
	private Integer genderId;
	
	@OneToMany(mappedBy="gender")
	private List<User> user;
	
	
	@Column(name = "gender_code")
	private String genderCode;
	@Column(name = "gender_label")
	private String genderLabel;
	@Column(name = "gender_description")
	private String genderDescription;
	@Column(name = "gender_status")
	private String genderStatus;
	
	//Audit fields
	@Column(name = "sequence_number")
	private Integer sequenceNumber;
//	@Column(name = "restrict_customization")
//	private boolean restrictCustomization;
	@Column(name = "create_date")
	private Date createdDate;
	@Column(name = "created_by_global_user_id")
	private String createdBy;
	@Column(name = "modified_date")
	private Date modifiedDate;
	@Column(name = "modified_by_global_user_id")
	private String modifiedBy;
	@Column(name = "modified_reason")
	private String modifiedReason;
	@Column(name = "tenant_id")
	private String tenantId;
//	@Column(name = "is_default")
//	private boolean isDefault;

	public Integer getGenderId() {
		return genderId;
	}

	public void setGenderId(Integer genderId) {
		this.genderId = genderId;
	}

	public String getGenderCode() {
		return genderCode;
	}

	public void setGenderCode(String genderCode) {
		this.genderCode = genderCode;
	}

	public String getGenderLabel() {
		return genderLabel;
	}

	public void setGenderLabel(String genderLabel) {
		this.genderLabel = genderLabel;
	}

	public String getGenderDescription() {
		return genderDescription;
	}

	public void setGenderDescription(String genderDescription) {
		this.genderDescription = genderDescription;
	}

	public String getGenderStatus() {
		return genderStatus;
	}

	public void setGenderStatus(String genderStatus) {
		this.genderStatus = genderStatus;
	}

	public Integer getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Integer sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

//	public boolean isRestrictCustomization() {
//		return restrictCustomization;
//	}
//
//	public void setRestrictCustomization(boolean restrictCustomization) {
//		this.restrictCustomization = restrictCustomization;
//	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getModifiedReason() {
		return modifiedReason;
	}

	public void setModifiedReason(String modifiedReason) {
		this.modifiedReason = modifiedReason;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

//	public boolean isDefault() {
//		return isDefault;
//	}
//
//	public void setDefault(boolean isDefault) {
//		this.isDefault = isDefault;
//	}

}
