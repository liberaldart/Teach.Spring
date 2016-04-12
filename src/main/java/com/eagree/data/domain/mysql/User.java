package com.eagree.data.domain.mysql;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;


@Entity
public class User extends BaseAuditDomain {

	@NotNull
	private String emailAddress;
	
	private String password;
	
	@NotNull
	private String registrationType;
	
	@NotNull
	private boolean active=true;
	
	@NotNull
	private boolean deleted=false;
	
	private Date lastLoginTime;
	
	@NotNull
	private int failedLoginAttemps=0;
	
	@NotNull
	private boolean resetPassword=false;
	
	private String title;
	
	private String firstName;
	
	private String lastName;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinTable(name="ORG_USERS")
	private Organization customer;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="user_roles")
	private Set<Role> roles;

	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="user_privileges")
	private Set<Privilege> privileges;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Organization getCustomer() {
		return customer;
	}

	public void setCustomer(Organization customer) {
		this.customer = customer;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Set<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(Set<Privilege> privileges) {
		this.privileges = privileges;
	}

	public String getRegistrationType() {
		return registrationType;
	}

	public void setRegistrationType(String registrationType) {
		this.registrationType = registrationType;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public int getFailedLoginAttemps() {
		return failedLoginAttemps;
	}

	public void setFailedLoginAttemps(int failedLoginAttemps) {
		this.failedLoginAttemps = failedLoginAttemps;
	}

	public boolean isResetPassword() {
		return resetPassword;
	}

	public void setResetPassword(boolean resetPassword) {
		this.resetPassword = resetPassword;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
