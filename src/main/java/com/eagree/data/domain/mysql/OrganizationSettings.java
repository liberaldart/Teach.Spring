package com.eagree.data.domain.mysql;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class OrganizationSettings extends BaseAuditDomain {

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ORG_ID")
	Organization org;
	
	@NotNull
	SettingName name;
	
	@NotNull
	String value;
	
	
}

