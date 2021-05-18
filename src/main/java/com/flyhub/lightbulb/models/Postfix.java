package com.flyhub.lightbulb.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin_lookup_postfix")
public class Postfix {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="postfix_id")
	private Integer postfixId;
	

	@Column(name = "postfix_name")
	private String postfixName;
	@Column(name = "postfix_code")
	private String postfixCode;
	@Column(name = "postfix_label")
	private String postfixLabel;
	@Column(name = "postfix_description")
	private String postfixDescription;
	
	
	//Audit fields
	@Column(name = "postfix_status")
	private String postfixStatus;
	@Column(name = "sequence_number")
	private Integer sequenceNumber;
	@Column(name = "restrict_customization")
	private boolean restrictCustomization;
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
	@Column(name = "is_default")
	private boolean isDefault;
	public Integer getPostfixId() {
		return postfixId;
	}
	public void setPostfixId(Integer postfixId) {
		this.postfixId = postfixId;
	}
	public String getPostfixName() {
		return postfixName;
	}
	public void setPostfixName(String postfixName) {
		this.postfixName = postfixName;
	}
	public String getPostfixCode() {
		return postfixCode;
	}
	public void setPostfixCode(String postfixCode) {
		this.postfixCode = postfixCode;
	}
	public String getPostfixLabel() {
		return postfixLabel;
	}
	public void setPostfixLabel(String postfixLabel) {
		this.postfixLabel = postfixLabel;
	}
	public String getPostfixDescription() {
		return postfixDescription;
	}
	public void setPostfixDescription(String postfixDescription) {
		this.postfixDescription = postfixDescription;
	}
	public String getPostfixStatus() {
		return postfixStatus;
	}
	public void setPostfixStatus(String postfixStatus) {
		this.postfixStatus = postfixStatus;
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
	public boolean isDefault() {
		return isDefault;
	}
	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	
	

}
