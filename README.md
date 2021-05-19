# Spring-Financial-Backend
 Spring Financial is an online banking app mainly developed in Spring Boot(backend), React(frontend) and PostgreSQL(database).
 
## Implemented

- Account service
- Card service
- Employee service
- Location service
- Payload service
- Rating service
- Security service
- Transaction service
- User service

## Technologies

- Java
- PostgreSQL
- Spring Boot
- Spring Security
- Spring Web
- Spring Data JPA
- Spring Starter Mail

## System requirements

- Java JDK 11
- Maven
- IDE (we used IntelliJ IDEA)
- pgAdmin

## Setup

1. Open project in preferred IDE (we used IntelliJ IDEA).
2. Create databse using pgAdmin and name it spring-financial.
3. Create resources folder in src and also create application.properties file.
4. Copy the following code in the application.properties file(fill "YOUR USER" and "YOUR PASSWORD")
```
spring.datasource.url=jdbc:postgresql://localhost:5432/spring-financial
spring.datasource.username="YOUR USER"
spring.datasource.password="YOUR PASSWORD"
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.format_sql=true

server.error.include-message=always

springFinancial.app.jwtSecret= financialSecretKey
springFinancial.app.jwtExpirationMs= 86400000 
```
5. Run project.
