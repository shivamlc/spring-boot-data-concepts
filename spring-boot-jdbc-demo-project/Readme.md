# This project is a demo for Spring JDBC 
- JDBC vs Spring JDBC: JDBC is complex to use. In JDBC, we need to manually connect to data source, prepare a "PreparedStatement" to execute query, then extract individual data value from the result set. In the end, we also need to close the jdbc connection to data and close the prepared statement. This whole process requires more code and effort to handle exceptions properly. If an exception is thrown before the connection or statement is closed, then memore leak will happen.
Spring JDBC reduces the complexity by dealing with overheads itself. The code is also reduced.

## Spring boot features:
- Auto-configuration: this feature checks for classes available on classpath and does auto-configuration for them. It automatically configures connection to H2 database if it sees in-memory db like H2 on classpath. It auto configures a dispatcher servlet if it sees a web application on classpath. If it sees JPA on classpath, then it will auto configure EntityManagerFactory and TransactionManager.
