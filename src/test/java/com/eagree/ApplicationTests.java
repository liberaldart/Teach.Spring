package com.eagree;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.eagree.data.repository.mysql.FolderRepository;
import com.eagree.data.repository.mysql.OrganizationRepository;
import com.eagree.data.repository.mysql.RoleRepository;
import com.eagree.data.repository.mysql.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class ApplicationTests {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private OrganizationRepository organizationRepository;
	
	@Autowired
	private FolderRepository folderRepository;
	
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void jpaRepositoriesNotNull() {
		
		assertNotNull(userRepository);
		assertNotNull(roleRepository);
		assertNotNull(organizationRepository);
		assertNotNull(folderRepository);
		
		
	}

}
