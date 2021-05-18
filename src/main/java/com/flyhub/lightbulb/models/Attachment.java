package com.flyhub.lightbulb.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="attachment")
public class Attachment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "attachment_id")
	private Integer attachmentId;

	@Column(name = "attachment_name")
	private Integer attachmentName;
	@Column(name = "attachment_label")
	private Integer attachmentLabel;
	@Column(name = "attachment_description")
	private Integer attachmentDescription;

	// Audit fields
	@Column(name = "attachment_status")
	private Integer attachmentStatus;
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
	public Integer getAttachmentId() {
		return attachmentId;
	}
	public void setAttachmentId(Integer attachmentId) {
		this.attachmentId = attachmentId;
	}
	public Integer getAttachmentName() {
		return attachmentName;
	}
	public void setAttachmentName(Integer attachmentName) {
		this.attachmentName = attachmentName;
	}
	public Integer getAttachmentLabel() {
		return attachmentLabel;
	}
	public void setAttachmentLabel(Integer attachmentLabel) {
		this.attachmentLabel = attachmentLabel;
	}
	public Integer getAttachmentDescription() {
		return attachmentDescription;
	}
	public void setAttachmentDescription(Integer attachmentDescription) {
		this.attachmentDescription = attachmentDescription;
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
	
	
	

}
