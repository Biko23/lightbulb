package com.flyhub.lightbulb.models;

import java.sql.Date;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
//@Getter @Setter @NoArgsConstructor
@Table(name = "user_table")
public class User {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "global_user_id")
	private String globalUserId;

	@Column(name = "user_id")
	private String userId;
//	private boolean active;
	
	@OneToMany(mappedBy="globalUserId")
	List<Idea> ideas;
	
	@ManyToOne
	@JoinColumn(name="gender_id", insertable=false, updatable=false)
	private Gender gender;

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	// login details
	@Column(name = "user_name")
	private String username;
	@Column(name = "password")
	private String password;

	// Personal details
//	@Column(name = "postfix_id")
//	private int postfixId;
//	@Column(name = "prefix_id")
//	private int prefixId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "middle_name")
	private String middleName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "other_name")
	private String otherName;
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	@Column(name = "gender_id")
	private int genderId;

	@Column(name = "full_name")
	private String fullName;

	// Country details
//	@Column(name = "country_id")
//	private int countryId;
	@Column(name = "nationality")
	private String nationality;
//	@Column(name = "native_language")
//	private int nativeLanguage;
	@Column(name = "nin")
	private String nin;
	@Column(name = "card_number")
	private String cardNumber;

	// Contact Details
	@Column(name = "primary_phone")
	private String primaryPhone;
	@Column(name = "secondary_phone")
	private String secondaryPhone;
	@Column(name = "primary_email")
	private String primaryEmail;
	@Column(name = "secondary_email")
	private String secondaryEmail;
	@Column(name = "preffered_whatsapp_number")
	private String prefferedWhatsappNumber;

	// Audit fields
	@Column(name = "create_date")
	private Calendar createDate;
	@Column(name = "created_by_global_user_id")
	private String createdBy;
	@Column(name = "modified_by_global_user_id")
	private String modifiedBy;
	@Column(name = "modified_reason")
	private String modifiedReason;
	@Column(name = "modified_date")
	private Date modifiedDate;
//	@Column(name = "tenant_id")
//	private int tenantId;
//	@Column(name = "status_id")
//	private int statusId;
	
	//Roles field
//	@Column(name = "is_admin")
//	private boolean isAdmin;
//	@Column(name = "is_super_admin")
//	private boolean isSuperAdmin;
//	@Column(name = "is_end_user")
//	private boolean isEndUser;
//	@Column(name = "is_system_account")
//	private boolean isSystemAccount;
//	@Column(name = "is_employee")
//	private boolean isEmployee;
//	
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(
			name="user_roles",
			joinColumns = @JoinColumn(name = "global_user_id", referencedColumnName = "global_user_id"),
			inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "role_id")
			)
	private Set<Role> roles = new HashSet<>();
	
	

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	public void addRole(Role role) {
		this.roles.add(role);
	}

	public String getGlobalUserId() {
		return globalUserId;
	}

	public void setGlobalUserId(String globalUserId) {
		this.globalUserId = globalUserId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public int getPostfixId() {
//		return postfixId;
//	}
//
//	public void setPostfixId(int postfixId) {
//		this.postfixId = postfixId;
//	}
//
//	public int getPrefixId() {
//		return prefixId;
//	}
//
//	public void setPrefixId(int prefixId) {
//		this.prefixId = prefixId;
//	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getOtherName() {
		return otherName;
	}

	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getGenderId() {
		return genderId;
	}

	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

//	public int getCountryId() {
//		return countryId;
//	}

//	public void setCountryId(int countryId) {
//		this.countryId = countryId;
//	}
//
//	public String getNationality() {
//		return nationality;
//	}

//	public void setNationality(String nationality) {
//		this.nationality = nationality;
//	}

//	public int getNativeLanguage() {
//		return nativeLanguage;
//	}
//
//	public void setNativeLanguage(int nativeLanguage) {
//		this.nativeLanguage = nativeLanguage;
//	}

	public String getNin() {
		return nin;
	}

	public void setNin(String nin) {
		this.nin = nin;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getPrimaryPhone() {
		return primaryPhone;
	}

	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}

	public String getSecondaryPhone() {
		return secondaryPhone;
	}

	public void setSecondaryPhone(String secondaryPhone) {
		this.secondaryPhone = secondaryPhone;
	}

	public String getPrimaryEmail() {
		return primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	public String getSecondaryEmail() {
		return secondaryEmail;
	}

	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}

	public String getPrefferedWhatsappNumber() {
		return prefferedWhatsappNumber;
	}

	public void setPrefferedWhatsappNumber(String prefferedWhatsappNumber) {
		this.prefferedWhatsappNumber = prefferedWhatsappNumber;
	}

	public Calendar getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Calendar createDate) {
		this.createDate = createDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
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

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

//	public int getTenantId() {
//		return tenantId;
//	}
//
//	public void setTenantId(int tenantId) {
//		this.tenantId = tenantId;
//	}
//
//	public int getStatusId() {
//		return statusId;
//	}
//
//	public void setStatusId(int statusId) {
//		this.statusId = statusId;
//	}
//
//	public boolean isAdmin() {
//		return isAdmin;
//	}
//
//	public void setAdmin(boolean isAdmin) {
//		this.isAdmin = isAdmin;
//	}
//
//	public boolean isSuperAdmin() {
//		return isSuperAdmin;
//	}
//
//	public void setSuperAdmin(boolean isSuperAdmin) {
//		this.isSuperAdmin = isSuperAdmin;
//	}
//
//	public boolean isEndUser() {
//		return isEndUser;
//	}
//
//	public void setEndUser(boolean isEndUser) {
//		this.isEndUser = isEndUser;
//	}
//
//	public boolean isSystemAccount() {
//		return isSystemAccount;
//	}
//
//	public void setSystemAccount(boolean isSystemAccount) {
//		this.isSystemAccount = isSystemAccount;
//	}
//
//	public boolean isEmployee() {
//		return isEmployee;
//	}
//
//	public void setEmployee(boolean isEmployee) {
//		this.isEmployee = isEmployee;
//	}

}
