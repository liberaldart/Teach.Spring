package com.eagree.data.repository.mysql;


import org.springframework.data.jpa.repository.JpaRepository;

import com.eagree.data.domain.mysql.Role;

public interface Rolerepository extends JpaRepository<Role, Long> {

}
