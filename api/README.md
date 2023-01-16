# Installation instructions

* Create the database in MySQL Workbench or in the command line client such as follows :
`CREATE DATABASE fil_rouge;`
* Edit `spring.datasource.username` and `spring.datasource.password` fields in `application.properties` which is located in `ressources` to fit your database setup.
* Do the same with value of `javax.persistence.jdbc.user` and `javax.persistence.jdbc.password` properties in the `persistence.xml` file located in `ressources/META-INF`.