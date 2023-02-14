##FastLiteMessage build status
Real time chat application group oriented built with React and Spring Boot. Talk with your friends, create and add users to conversation, send messages or images, set groups administrators and start video calls ! (coming soon)

##Project Requirements
JDK 17
NodeJS v16.14.2
ReactJS v17
Material UI v5.7.0
MySQL Server

##Project development set up
This project use liquibase as a version control for database. When you will start backend, all tables and structures will be generated automatically.
You can disable Liquibase by setting spring.liquibase.enabled=false in application.properties.
To try the project on localhost, check that nothing runs on ports 9090 (Spring Boot) and 3000 (React app)
You can edit spring.datasource in backend/src/main/resources/application.properties and username and password in backend/src/main/resources/liquibase.properties with your own MySQL login / password
Create a database named "fastlitemessage" or you can also modify the name in the properties files mentioned just above.


##Start backend
Go inside backend folder then type mvn spring-boot:run to launch backend.
Or you can type mvn clean package to generate a JAR file and then start server with java -jar path/to/jar/file (Normally in inside backend/target/)

##Start frontend
Go inside frontend-web folder and then type npm run start