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

@Entity
@Table(name = "idea_category")
public class IdeaCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private Integer category_id;
	
	@OneToMany(mappedBy = "category_id")
	List<Idea> idea;


	@Column(name = "category_name")
	private String categoryName;
	@Column(name = "category_label")
	private String categoryLabel;
	@Column(name = "category_description")
	private String categoryDescription;

	// Audit fields
	@Column(name = "category_status")
	private String categoryStatus;
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

	public Integer getCategoryId() {
		return category_id;
	}

	public void setCategoryId(Integer category_id) {
		this.category_id = category_id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryLabel() {
		return categoryLabel;
	}

	public void setCategoryLabel(String categoryLabel) {
		this.categoryLabel = categoryLabel;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public String getCategoryStatus() {
		return categoryStatus;
	}

	public void setCategoryStatus(String categoryStatus) {
		this.categoryStatus = categoryStatus;
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
	

	public List<Idea> getIdeas() {
		return idea;
	}

	public void setIdeas(List<Idea> idea) {
		this.idea = idea;
	}

}
