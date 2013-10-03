Example usage of embedded servers
=================================

Embedded servers
----------------

| Server									| Command		|
| --- 										| :---:			|
| [Tomcat](http://tomcat.apache.org/maven-plugin-2.0/tomcat7-maven-plugin/)	| `mvn tomcat7:run`	| 
| [Jetty](http://www.eclipse.org/jetty/documentation/current/)			| `mvn jetty:run`	| 

Default configuration points to: [http://localhost:9090/](http://localhost:9090/)

Parameters
----------

You can change port and/or context path of embedded server by setting apropriate parameters:

- `${port}` or `${<ServerName>.port}` - server's port
- `${path}` or `${<ServerName>.path}` - server's context path

Example of a custom configuration: 
- `mvn -Dport=9099 -Dpath='test' jetty:run` ==> [http://localhost:9099/test](http://localhost:9099/test)

Donation
--------

Your pledges keep my git repository growing in new projects. 
I hope you found here something useful and/or interesting.

<a href='http://www.pledgie.com/campaigns/22261'><img alt='Click here to lend your support to: mendlik-open-repository and make a donation at www.pledgie.com !' src='http://www.pledgie.com/campaigns/22261.png?skin_name=chrome' border='0' /></a>
