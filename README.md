<h3>Eureka Server Microservices</h3>
1.Spring Cloud Eureka<br>
2. Spring Cloud Gateway<br>
3. Spring Cloud Hystrix</br>
4. API Gateway</br>


<p>We're making two microservices in this application: an order service & a payment service. We register these two services in Eureka. Then they can talk to each other. Then we register an API gateway to the Service Registry as well. This API gateway comes from Spring Cloud. The API calls we make in Postman end up getting funneled to an H2 database.</p>

