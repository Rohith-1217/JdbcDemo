Developed JDBC programs for following classes using JDBC Technical terms : 

PreparedStatement : JDBC PreparedStatement can be used when you plan to use the same SQL statement many times. It is used to handle precompiled query. If we want to 			    execute same query with different values for more than one time then precompiled queries will reduce the no of compilations.

ResultSetMetaData : ResultSetMetaData is an interface in java.sql package of JDBC API which is used to get the metadata about a ResultSet object. Whenever you query the 			    database using SELECT statement, the result will be stored in a ResultSet object.

JdbcTransaction : Transactions enable you to control if, and when, changes are applied to the database. It treats a single SQL statement or a group of SQL statements as 			  one logical unit, and if any statement fails, the whole transaction fails.


JdbcBatchProcessing : Batch Processing allows you to group related SQL statements into a batch and submit them with one call to the database. When you send several SQL 		      statements to the database at once, you reduce the amount of communication overhead, thereby improving performance. JDBC drivers are not required 		      to support this feature.

DatabaseMetaData : Metadata basically means the data that provide a structured description about some other data. From a programmer's point of view, database metadata 			   refers to data about database data or, more elaborately, the information about tables, views, column types, column names, result sets, stored 			   procedures, and databases
