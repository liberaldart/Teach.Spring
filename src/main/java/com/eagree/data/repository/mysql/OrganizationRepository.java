package com.eagree.data.repository.mysql;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eagree.data.domain.mysql.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {

}
