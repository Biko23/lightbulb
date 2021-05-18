package com.flyhub.lightbulb.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin_lookup_status")
public class Status {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "status_id")
	private Integer statusId;

	@Column(name = "status_name")
	private Integer statusName;
	@Column(name = "status_code")
	private Integer statusCode;
	@Column(name = "status_label")
	private Integer statusLabel;
	@Column(name = "status_description")
	private Integer statusDescription;

	// Audit fields
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

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public Integer getStatusName() {
		return statusName;
	}

	public void setStatusName(Integer statusName) {
		this.statusName = statusName;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public Integer getStatusLabel() {
		return statusLabel;
	}

	public void setStatusLabel(Integer statusLabel) {
		this.statusLabel = statusLabel;
	}

	public Integer getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(Integer statusDescription) {
		this.statusDescription = statusDescription;
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
