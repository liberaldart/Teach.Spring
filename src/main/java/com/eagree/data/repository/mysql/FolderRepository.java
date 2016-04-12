package com.eagree.data.repository.mysql;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eagree.data.domain.mysql.Folder;

public interface FolderRepository extends JpaRepository<Folder, Long> {

}
