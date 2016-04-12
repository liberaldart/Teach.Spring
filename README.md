# Teach.Spring
Learn to teach Spring framework for the faint hearted

I am using the Spring JPA Orm with HSQL db. This configuration is present in the file: 
com.eagree.dao.conf.OrmConfiguration.java

in "com.eagree.dao.conf.OrmConfiguration.java", I specify "@Configuration" to tell Spring that it's a configuration
class. I also specify "@EnableJpaRepositories(basePackages="com.eagree.data.repository.mysql")" to hint Spring that
I don't intend to implement the JpaRepository interface I did extend in the package specified. With this last anno-
-tation spring creates the default JpaRepository implementation with those 18 methods defined for me.

The JpaRepository interfaces in "com.eagree.data.repository.mysql" refer to the POJOs I declared in 
"com.eagree.data.domain.mysql" package.

In "com.eagree.dao.conf.OrmConfiguration.java", I gave Spring the bean it needs in order to access the DataSource.
That bean is EntityManagerFactory.
This EntityManagerFactory would need to access DataSource and JpaVendorAdaptor. I gave those stuff too in another 
bean underneath the EntityManagerFactory.

In the same file, if I mention ```adapter.setGenerateDdl(true);``` instead of ```adapter.setGenerateDdl(false);```
then I get a lot of error in the gradle generated console log. Looks like I couldn't create the SQL Schema with Hibernate
library. Need to work on this one. May be I will raise an issue on Jira.

How to use the repo:

Steps:
1. git clone <this repo's link>
2. Run ```gradle init```
3. Run ```gradle build```

Test should pass and a html file would get generated in
...build/reports/tests/index.html

Question: What I intend to do?
Answer: I want to generate sql commands for schema. I also want to be able to populate some dummy content in the most
efficient way.
