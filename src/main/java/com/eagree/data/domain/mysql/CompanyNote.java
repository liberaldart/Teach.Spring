package com.eagree.data.domain.mysql;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class CompanyNote extends BaseAuditDomain {

	@NotNull
	String note;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="company_id")
	OrganizationCompany company;
	
}
