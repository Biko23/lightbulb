package com.flyhub.lightbulb.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin_lookup_prefix")
public class Prefix {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prefix_id")
	private Integer prefixId;

	@Column(name = "prefix_name")
	private String prefixName;
	@Column(name = "prefix_code")
	private String prefixCode;
	@Column(name = "prefix_label")
	private String prefixLabel;
	@Column(name = "prefix_description")
	private String prefixDescription;

	// Audit fields
	@Column(name = "prefix_status")
	private Integer prefixStatus;
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

	public Integer getPrefixId() {
		return prefixId;
	}

	public void setPrefixId(Integer prefixId) {
		this.prefixId = prefixId;
	}

	public String getPrefixName() {
		return prefixName;
	}

	public void setPrefixName(String prefixName) {
		this.prefixName = prefixName;
	}

	public String getPrefixCode() {
		return prefixCode;
	}

	public void setPrefixCode(String prefixCode) {
		this.prefixCode = prefixCode;
	}

	public String getPrefixLabel() {
		return prefixLabel;
	}

	public void setPrefixLabel(String prefixLabel) {
		this.prefixLabel = prefixLabel;
	}

	public String getPrefixDescription() {
		return prefixDescription;
	}

	public void setPrefixDescription(String prefixDescription) {
		this.prefixDescription = prefixDescription;
	}

	public Integer getPrefixStatus() {
		return prefixStatus;
	}

	public void setPrefixStatus(Integer prefixStatus) {
		this.prefixStatus = prefixStatus;
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
