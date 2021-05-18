package com.flyhub.lightbulb.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notes")
public class Note {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "note_id")
	private Integer noteId;

	@Column(name = "note_name")
	private Integer noteName;
	@Column(name = "note_label")
	private Integer noteLabel;
	@Column(name = "note_content")
	private Integer noteContent;
	@Column(name = "note_description")
	private Integer noteDescription;

	// Audit fields
	@Column(name = "note_status")
	private Integer noteStatus;
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

	public Integer getNoteId() {
		return noteId;
	}

	public void setNoteId(Integer noteId) {
		this.noteId = noteId;
	}

	public Integer getNoteName() {
		return noteName;
	}

	public void setNoteName(Integer noteName) {
		this.noteName = noteName;
	}

	public Integer getNoteLabel() {
		return noteLabel;
	}

	public void setNoteLabel(Integer noteLabel) {
		this.noteLabel = noteLabel;
	}

	public Integer getNoteContent() {
		return noteContent;
	}

	public void setNoteContent(Integer noteContent) {
		this.noteContent = noteContent;
	}

	public Integer getNoteDescription() {
		return noteDescription;
	}

	public void setNoteDescription(Integer noteDescription) {
		this.noteDescription = noteDescription;
	}

	public Integer getNoteStatus() {
		return noteStatus;
	}

	public void setNoteStatus(Integer noteStatus) {
		this.noteStatus = noteStatus;
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
