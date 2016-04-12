package com.eagree.dao.conf;



import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

/*
 * @EnableJpaRepository looks for classes that extend JpaRepository interface
 * and implements those classes so that you don't have to implement them.
 */
@Configuration
@EnableJpaRepositories(basePackages="com.eagree.data.repository.mysql")
public class OrmConfiguration {
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource,
			JpaVendorAdapter jpaVendorAdapter){
		LocalContainerEntityManagerFactoryBean emfb =
				new LocalContainerEntityManagerFactoryBean();
		emfb.setDataSource(dataSource);
		emfb.setJpaVendorAdapter(jpaVendorAdapter);
		emfb.setPackagesToScan("com.eagree.data.domain.mysql");
		return emfb;
	}
	
	@Bean
	public JpaVendorAdapter jpaVendorAdapter(){
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.HSQL);
		adapter.setShowSql(true);
		adapter.setGenerateDdl(false);
		adapter.setDatabasePlatform("org.hibernate.dialect.HSQLDialect");
		return adapter;
	}

}
