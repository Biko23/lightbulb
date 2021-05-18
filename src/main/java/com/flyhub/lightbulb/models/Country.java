package com.flyhub.lightbulb.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer countryId;

	private String countryName;
	private String countryCode;
	private String countryLabel;
	private String countryDescription;
	private String countryAlias;
	private String countryInitial;
	private String countryDialingCode;
	
	
	
	private Integer sequenceNumber;
	private boolean restrictCustomization;
	private String countryStatus;
	private Date createdDate;
	private String createdBy;
	private Date modifiedDate;
	private String modifiedBy;
	private String tenantId;
	private boolean isDefault;
	
	@ManyToOne
	@JoinColumn(name="continentid", insertable = false, updatable = false)
	private Continent continent;
	private Integer continentid;
	
	
	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryLabel() {
		return countryLabel;
	}

	public void setCountryLabel(String countryLabel) {
		this.countryLabel = countryLabel;
	}

	public String getCountryDescription() {
		return countryDescription;
	}

	public void setCountryDescription(String countryDescription) {
		this.countryDescription = countryDescription;
	}

	public String getCountryAlias() {
		return countryAlias;
	}

	public void setCountryAlias(String countryAlias) {
		this.countryAlias = countryAlias;
	}

	public String getCountryInitial() {
		return countryInitial;
	}

	public void setCountryInitial(String countryInitial) {
		this.countryInitial = countryInitial;
	}

	public String getCountryDialingCode() {
		return countryDialingCode;
	}

	public void setCountryDialingCode(String countryDialingCode) {
		this.countryDialingCode = countryDialingCode;
	}

	public Integer getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Integer sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public boolean isRestrictCustomization() {
		return restrictCustomization;
	}

	public void setRestrictCustomization(boolean restrictCustomization) {
		this.restrictCustomization = restrictCustomization;
	}

	public String getCountryStatus() {
		return countryStatus;
	}

	public void setCountryStatus(String countryStatus) {
		this.countryStatus = countryStatus;
	}


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

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

}
