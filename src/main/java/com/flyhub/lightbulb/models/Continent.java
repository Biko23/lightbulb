package com.flyhub.lightbulb.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Continent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer continentId;

	private String continentName;
	private String continentCode;
	private String continentLabel;
	private String continentDescription;
	private String continentAlias;
	private String continentInitial;
	


	private Integer sequenceNumber;
	private boolean restrictCustomization;
	private String continentStatus;
	private Date createdDate;
	private String createdBy;
	private Date modifiedDate;
	private String modifiedBy;
	private String tenantId;
	private boolean isDefault;
	
	@OneToMany(mappedBy = "continent")
	private List<Country> country;

	public Integer getContinentId() {
		return continentId;
	}

	public void setContinentId(Integer continentId) {
		this.continentId = continentId;
	}

	public String getContinentName() {
		return continentName;
	}

	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}

	public String getContinentCode() {
		return continentCode;
	}

	public void setContinentCode(String continentCode) {
		this.continentCode = continentCode;
	}

	public String getContinentLabel() {
		return continentLabel;
	}

	public void setContinentLabel(String continentLabel) {
		this.continentLabel = continentLabel;
	}

	public String getContinentDescription() {
		return continentDescription;
	}

	public void setContinentDescription(String continentDescription) {
		this.continentDescription = continentDescription;
	}

	public String getContinentAlias() {
		return continentAlias;
	}

	public void setContinentAlias(String continentAlias) {
		this.continentAlias = continentAlias;
	}

	public String getContinentInitial() {
		return continentInitial;
	}

	public void setContinentInitial(String continentInitial) {
		this.continentInitial = continentInitial;
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

	public String getContinentStatus() {
		return continentStatus;
	}

	public void setContinentStatus(String continentStatus) {
		this.continentStatus = continentStatus;
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
