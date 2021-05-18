package com.flyhub.lightbulb.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "idea_event")
public class IdeaEvent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "event_id")
	private Integer eventId;

	@Column(name = "event_name")
	private Integer eventName;
	@Column(name = "event_label")
	private Integer eventLabel;
	@Column(name = "event_description")
	private Integer eventDescription;

	// Audit fields
	@Column(name = "event_status")
	private Integer eventStatus;
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

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public Integer getEventName() {
		return eventName;
	}

	public void setEventName(Integer eventName) {
		this.eventName = eventName;
	}

	public Integer getEventLabel() {
		return eventLabel;
	}

	public void setEventLabel(Integer eventLabel) {
		this.eventLabel = eventLabel;
	}

	public Integer getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(Integer eventDescription) {
		this.eventDescription = eventDescription;
	}

	public Integer getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(Integer eventStatus) {
		this.eventStatus = eventStatus;
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
