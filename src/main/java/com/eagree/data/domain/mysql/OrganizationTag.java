package com.eagree.data.domain.mysql;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrganizationTag extends BaseAuditDomain{

	String tagName;
	
	@ManyToOne
	@JoinColumn(name="org_id")
	Organization org;
	
}
