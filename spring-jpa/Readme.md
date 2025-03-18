# Why use JPA (Java Persistence Api)?
- With JDBC or Spring JDBC, we need to extract data from tables using queries and, map extracted data to Object beans using row mappers or BeanPropertyRowMapper.
- Queries can become complex in large applications.
- JPA eases the process by mapping object beans (also called entities) to tables (relations) in database.
- JPA writes queries on behalf of developer.
- JPA is an interface. Hibernate implements JPA.
- Hibernate existed before JPA. Hibernate is a popular ORM framework.
- JPA came in later after seeing sucess of Hibernate.
- ORM framework maps object to a table (or relation) in database.
- Hibernate has lot more functions than what JPA specifies.
- We can use other ORM frameworks with JPA as well.

## Troubleshoot
- list all processes running at port 8081: lsof -i tcp:8081
- kill process: kill -9 pid

## Possible Values for spring.sql.init.mode:

- always: This means that the SQL scripts (schema.sql and data.sql) will always be executed on every application startup, regardless of whether the database already exists or not.

- embedded: The scripts will be run only if an embedded database (like H2 or HSQLDB) is being used. This is useful for situations where you want to initialize an in-memory database when testing or running locally, but not when connecting to an external database.

- never: This means the SQL scripts will never be executed, regardless of the database type.

- create: This will run the SQL scripts on first startup (typically when the database doesn't exist yet) to create the schema and data. It can be useful for creating the initial schema only when the application is run for the first time.

- drop-and-create: This will drop the schema and recreate it every time the application starts. Useful in development for testing with a clean database.



