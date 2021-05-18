package com.flyhub.lightbulb.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="idea_table")
public class Idea {
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "idea_id")
	private String ideaId;
	
	@ManyToOne
	@JoinColumn(name="category_id", referencedColumnName = "category_id", insertable=false, updatable=false )    //
	private IdeaCategory ideacategory;
	@Column(name="category_id")
	private Integer category_id;
	
	@ManyToOne
	@JoinColumn(name="global_user_id", referencedColumnName= "global_user_id", insertable=false, updatable=false)
	private User user;
	@Column(name="global_user_id")
	private String globalUserId;
	
	@Column(name="user_id")
	private String userId;
	@Column(name="title")
	private String title;
	@Column(name="description")
	private String description;
	@Column(name="submission_date")
	private Date submissionDate;
	@Column(name="created_date")
	private Date createdDate;
	@Column(name="created_by")
	private String createdBy;
	@Column(name="modified_date")
	private Date modifiedDate;
	@Column(name="modified_by")
	private String modifiedBy;
	@Column(name="modified_reason")
	private String modifiedReason;
	@Column(name="priority_id")
	private Integer priorityId;
	@Column(name="tenant_id")
	private String tenantId;
	@Column(name="status")
	private String status;
	@Column(name="approval_status")
	private String approvalStatus;
	@Column(name="workflow_status")
	private String workflowStatus;
	@Column(name="executive_summary")
	private String executiveSummary;
	@Column(name="background_idea_description")
	private String backgroundIdeaDescription;
	@Column(name="has_attachment")
	private boolean hasAttachment;
	
	public String getIdeaId() {
		return ideaId;
	}
	public void setIdeaId(String ideaId) {
		this.ideaId = ideaId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getGlobalUserId() {
		return globalUserId;
	}
	public void setGlobalUserId(String globalUserId) {
		this.globalUserId = globalUserId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getCategoryId() {
		return category_id;
	}
	public void setCategoryId(Integer category_id) {
		this.category_id = category_id;
	}
	public Date getSubmissionDate() {
		return submissionDate;
	}
	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
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
	public Integer getPriorityId() {
		return priorityId;
	}
	public void setPriorityId(Integer priorityId) {
		this.priorityId = priorityId;
	}
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	public String getWorkflowStatus() {
		return workflowStatus;
	}
	public void setWorkflowStatus(String workflowStatus) {
		this.workflowStatus = workflowStatus;
	}
	public String getExecutiveSummary() {
		return executiveSummary;
	}
	public void setExecutiveSummary(String executiveSummary) {
		this.executiveSummary = executiveSummary;
	}
	public String getBackgroundIdeaDescription() {
		return backgroundIdeaDescription;
	}
	public void setBackgroundIdeaDescription(String backgroundIdeaDescription) {
		this.backgroundIdeaDescription = backgroundIdeaDescription;
	}
	public boolean getHasAttachment() {
		return hasAttachment;
	}
	public void setHasAttachment(boolean hasAttachment) {
		this.hasAttachment = hasAttachment;
	}

	public IdeaCategory getIdeacategory() {
		return ideacategory;
	}
	public void setIdeacategory(IdeaCategory ideacategory) {
		this.ideacategory = ideacategory;
	}
	public void assignCategory(IdeaCategory category) {
		// TODO Auto-generated method stub
		this.ideacategory = category;
		
	}
	
	

}
