# Teach.Spring
Learn to teach Spring framework for the faint hearted

I am using the Spring JPA Orm with HSQL db. This configuration is present in the file: 
com.eagree.dao.conf.OrmConfiguration.java

In the same file, if I mention ```adapter.setGenerateDdl(true);``` instead of ```adapter.setGenerateDdl(false);```
then I get a lot of error in the gradle generated console log.

Steps:
1. Please clone the repository with git command
2. Run ```gradle init```
3. Run ```gradle build```

Test should pass and a html file would get generated in
...build/reports/tests/index.html

Question: What I intend to do?
Answer: I want to generate sql commands for schema. I also want to be able to populate some dummy content in the most
efficient way.
