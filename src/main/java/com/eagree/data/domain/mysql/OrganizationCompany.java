package com.eagree.data.domain.mysql;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class OrganizationCompany extends BaseAuditDomain {

	@NotNull
	private String name;
	
	private Address address;
	
	private String website;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ORG_ID")
	private Organization org;
	
	
	private String phone;
	
	private String fax;
	
	private CompanyType type;
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="company")
	private Set<CompanyNote> notes;
	
	@OneToMany(fetch=FetchType.EAGER)
	@JoinTable(name="org_company_tags")
	private Set<OrganizationTag> tags;
	
	@OneToMany(mappedBy="company",fetch=FetchType.LAZY)
	private Set<OrganizationCompanyContact> contacts;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Organization getOrg() {
		return org;
	}

	public void setOrg(Organization org) {
		this.org = org;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public CompanyType getType() {
		return type;
	}

	public void setType(CompanyType type) {
		this.type = type;
	}

	public Set<CompanyNote> getNotes() {
		return notes;
	}

	public void setNotes(Set<CompanyNote> notes) {
		this.notes = notes;
	}

	public Set<OrganizationTag> getTags() {
		return tags;
	}

	public void setTags(Set<OrganizationTag> tags) {
		this.tags = tags;
	}

	public Set<OrganizationCompanyContact> getContacts() {
		return contacts;
	}

	public void setContacts(Set<OrganizationCompanyContact> contacts) {
		this.contacts = contacts;
	}
	
	
	
}
