# Eldorado-Cleaning-and-Fixing-Services

This application was maade due the Challenge provided by the Eldorado Research Institute.

The application is developed with Java 11 and Spring. All the database interactions is handled by jOOQ, and the http requests are handled by the Spring Web. The file configuring the jooq file generation can be found on the 'resources' folder under the name jooq-config.xml
This project was developed using the Onion Architecture principles, dividing the application in tree layers: Domain, Application and Infrastructure.

To run the jOOQ file generation it's needed to change the generate-sources skip configuration to false on the pom.xml and run the maven command 'mvn clean install'. These files are a copy of the database structure, they are used to construct the jOOQ commands. You can find examples of them on the ServiceOrderRepositoryImpl.java file.

All the database structural migration is handled by the flyway. The scripts are checked and applied every time you run the project! You can find them on the 'resources/db/migration' path on this project! The flyway creates a database table to check which scripts are applied and if it was applied successfully.

The default port used in this project is the 8080 port. You can test the api using the swagger ui, to do it you can just access localhost:8080/swagger-ui/index.html#/ from your browser! Its configuration file can be found on the SpringFoxConfig.java file.

The database used is the SQLite and its file can be found on the project 'resources' folder under the name database.db.