package com.eagree.data.domain.mysql;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Organization extends BaseAuditDomain {

	
	@NotNull
	private String orgName;
	
	@NotNull
	private boolean deleted=false;
	
	private String phoneNumber;
	
	private String accountNumber;
	
	private String website;
	
	private String fax;
	
	@NotNull
	private boolean active = true;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ADDRESS_ID", nullable=true, insertable=true, updatable=true)
	private Address address;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinTable(name="ORG_USERS")
	Set<User> users;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="org")
	Set<OrganizationSettings> settings;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="org")
	Set<OrganizationCompany> companies;

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Set<OrganizationSettings> getSettings() {
		return settings;
	}

	public void setSettings(Set<OrganizationSettings> settings) {
		this.settings = settings;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	
}
