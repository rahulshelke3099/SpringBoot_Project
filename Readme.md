REST 

In Spring Boot, REST (Representational State Transfer) refers to a style 
of architecture used to build web services that allow applications to communicate
over HTTP by exchanging data in a stateless manner. RESTful services in Spring Boot
are built using Spring's REST support, primarily through @RestController, and they
allow data to be requested and manipulated through standardized HTTP methods such 
as GET, POST, PUT, and DELETE.

HTTP
The HTTP (Hypertext Transfer Protocol) is a communication protocol used for
exchanging information over the internet, primarily between web clients
(such as browsers) and servers. HTTP defines how requests and responses 
should be formatted, delivered, and interpreted, enabling the transfer of data
such as HTML, images, videos, and other files

Stateless Protocol
HTTP is stateless, meaning each request is independent of others; 
no connection or state is retained between requests. For example, 
the server does not inherently remember if a user is logged in. 
This has led to the use of cookies and sessions to maintain user state 
across multiple requests.