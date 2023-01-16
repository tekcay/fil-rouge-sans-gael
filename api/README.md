# Installation instructions

### Step 1: credentials:

* Edit `spring.datasource.username` and `spring.datasource.password` fields in `application.properties` which is located in `ressources` to fit your database setup.


### Step 2: check if the database exists

* check in MySQL Workbench or run `SHOW DATABASES;` in the command line client.

### If there is no `fil_rouge` database :

* create the database in MySQL Workbench or in the command line client such as follows : `CREATE DATABASE fil_rouge;`.

### If the database exists, you're good to go!