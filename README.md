# Spring-clould-gateway
Spring Cloud Gateway is a __non blocking API__. When using non blocking API, a thread is always available to process the incoming request. These request are then processed asynchronously in the background and once completed the response is returned. So no incoming request never gets blocked when using Spring Cloud Gateway.

## What is an API Gateway? Why do we need it?
An API Gateway acts as a single entry point for a collection of microservices. Any external client cannot access the microservices directly but can access them only through the application gateway
In a real world scenario an external client can be any one of the three
* Mobile Application
* Desktop Application
* External Services or third party Apps

### Spring Cloud Gateway Architecture
Spring Cloud Gateway is API Gateway implementation by Spring Cloud team on top of Spring reactive ecosystem. It consists of the following building blocks-
* Route: Route the basic building block of the gateway. It consists of
	* ID
	* destination URI
	* Collection of predicates and a collection of filters
* A route is matched if aggregate predicate is true.
* Predicate: Using this functionality we can match HTTP request, such as headers , url, cookies or parameters.
* Filter: These are instances Spring Framework GatewayFilter. Using this we can modify the request or response as per the requirement.

__Example URLs__
Application | URL 
--- | --- |
HardwareProduct-service | http://localhost:8080/hardware/productPage | 
SoftwareProduct-service | http://localhost:8080/software/productPage|  
