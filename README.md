# countries-travel-microservices
A simple microservices application that uses Spring Boot, Spring Cloud gateway and Eureka server. Has three services: 
  - countries-service: Retrieves all countries from countries database
  - travel-service: Retrieves all travel destinations from travel database
  - travelogue-service: Retrieves the country name, captial, language from the countries-service and retrieves the list of destinations (destination name and location) from the travel-service 
 
 Made as a project for the course Micro Services laboratory (CSL77)
 ## Team Members
 - [Sreya Salil](https://github.com/SreyaSalil) (1MS18CS124)
- Shriya B N (1MS18CS143)
## Microservice Architecture
![Retrieval of countries and destinations](https://user-images.githubusercontent.com/44632618/143679226-f08e4f1c-39c7-48a9-afe9-0aeb05828d3f.png)

