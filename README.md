Example usage of embedded servers
=================================

Embedded servers
----------------

| Server									| Command		|
| --- 										| :---:			|
| [Tomcat](http://tomcat.apache.org/maven-plugin-2.0/tomcat7-maven-plugin/)	| `mvn tomcat7:run`	| 
| [Jetty](http://www.eclipse.org/jetty/documentation/current/)			| `mvn jetty:run`	| 

Default configuration points to: http://localhost:9090/

Parameters
----------

You can change port and/or context path of embedded server by setting apropriate parameters:

- `${port}` or `${<ServerName>.port}` - server's port
- `${path}` or `${<ServerName>.path}` - server's context path

Example of a custom configuration: 
- `mvn -Dport=9099 -Dpath='test' jetty:run` ==> http://localhost:9099/test
